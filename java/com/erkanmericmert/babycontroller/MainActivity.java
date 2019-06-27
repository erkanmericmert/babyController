package com.erkanmericmert.babycontroller;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

public class MainActivity extends AppCompatActivity {

    static FirebaseAuth mAuth;
    private EditText emailText;
    private EditText passwordText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();


        emailText = findViewById(R.id.emailText);
        passwordText = findViewById(R.id.passwordText);

        FirebaseUser user = mAuth.getCurrentUser();

        if (user != null){
            Intent intent = new Intent(getApplicationContext(),HomeNav.class);
            startActivity(intent);
        }



        //"Üye değilseniz üye olmak için tıklayınız"
        TextView kayitTextView = findViewById(R.id.kayitolText);

        String uyeOlText = "Üye değilseniz üye olmak için tıklayınız";
        SpannableString spannableString = new SpannableString(uyeOlText);
        ClickableSpan clickableSpan1 = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Intent kayitOlIntent =new Intent(getApplicationContext(),KayitOl.class);
                startActivity(kayitOlIntent);

            }
        };
        spannableString.setSpan(clickableSpan1,15,40, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        kayitTextView.setText(spannableString);
        kayitTextView.setMovementMethod(LinkMovementMethod.getInstance());


        //Şifremi unuttum
        TextView forgetPasswordTextView = findViewById(R.id.forgetPasswordText);

        String sifreSorText = "Şifremi unuttum";
        SpannableString spannableString1 = new SpannableString(sifreSorText);
        ClickableSpan clickableSpan2 = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                if (emailText.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Lütfen email girişini yapınız",Toast.LENGTH_LONG).show();

                }else {
                    mAuth.sendPasswordResetEmail(emailText.getText().toString())
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {
                                Toast.makeText(getApplicationContext(),"Email gönderilmiştir.",Toast.LENGTH_LONG).show();
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(getApplicationContext(),"Emailinizi kontrol ediniz",Toast.LENGTH_LONG).show();
                        }
                    });

                }
            }
        };
        spannableString1.setSpan(clickableSpan2,0,15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        forgetPasswordTextView.setText(spannableString1);
        forgetPasswordTextView.setMovementMethod(LinkMovementMethod.getInstance());


    }

    public void signIn(View view){
        if (emailText.getText().toString().isEmpty() || passwordText.getText().toString().isEmpty()){
            Toast.makeText(this,"Email ve/veya şifrenizi girmediniz.",Toast.LENGTH_LONG).show();
        }else{

        mAuth.signInWithEmailAndPassword(emailText.getText().toString(),passwordText.getText().toString())
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Intent intent = new Intent(getApplicationContext(),HomeNav.class);
                            startActivity(intent);
                        }
                    }
                }).addOnFailureListener(this, new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(MainActivity.this, "Email ve/veya şifrenizi yanlış girdiniz.",Toast.LENGTH_LONG).show();
            }
        });}
    }

}
