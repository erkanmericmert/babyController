package com.erkanmericmert.babycontroller;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.firestore.FirebaseFirestore;

public class KayitOl extends AppCompatActivity {

    private EditText emailText;
    private EditText passwordText;
    private EditText nameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kayit_ol);

        emailText = findViewById(R.id.emailText);
        passwordText= findViewById(R.id.passwordText);
        nameText = findViewById(R.id.nameText);
    }

    public void signUp(View view){
        if (emailText.getText().toString().isEmpty() || passwordText.getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(),"Email ve/veya şifre girişini eksik yaptınız",Toast.LENGTH_LONG).show();
        }else{
            MainActivity.mAuth.createUserWithEmailAndPassword(emailText.getText().toString(),passwordText.getText().toString())
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {

                            if (task.isSuccessful()){
                                Toast.makeText(KayitOl.this,"Kullanıcı oluşturuldu!",Toast.LENGTH_LONG).show();
                                Parent currentParent = new Parent(nameText.getText().toString() ,emailText.getText().toString(),task.getResult().getUser().getUid());
                                FirebaseFirestore db = FirebaseFirestore.getInstance();
                                db.collection("parents").document(task.getResult().getUser().getUid()).set(currentParent);
                                Intent intent = new Intent(getApplicationContext(),HomeNav.class);
                                startActivity(intent);
                            }



                        }
                    }).addOnFailureListener(this, new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(KayitOl.this, e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                }
            });
        }



    }
}
