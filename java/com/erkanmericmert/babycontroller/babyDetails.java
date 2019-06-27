package com.erkanmericmert.babycontroller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class babyDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baby_details);
    }


    public void saveWeek(View view){

    }

    public void backBtn(View view){
        Intent intent = new Intent(getApplicationContext(),navBebekKontrol.class);
        startActivity(intent);

    }
}
