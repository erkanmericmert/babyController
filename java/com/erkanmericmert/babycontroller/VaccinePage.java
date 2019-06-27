package com.erkanmericmert.babycontroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class VaccinePage extends AppCompatActivity {

    /*CheckBox cb1;
    CheckBox cb2;
    CheckBox cb3;
    CheckBox cb4;
    CheckBox cb5;
    CheckBox cb6;
    CheckBox cb7;
    CheckBox cb8;
    CheckBox cb9;
    CheckBox cb10;
    CheckBox cb11;
    CheckBox cb12;
    CheckBox cb13;
    CheckBox cb14;
    CheckBox cb15;
    CheckBox cb16;
    CheckBox cb17;*/

    @Override
            protected void onCreate(Bundle savedInstanceState) {


                CheckBox cb2 = (CheckBox) findViewById(R.id.checkBox2);
                CheckBox cb3 = (CheckBox) findViewById(R.id.checkBox3);
                CheckBox cb4 = (CheckBox) findViewById(R.id.checkBox4);
                CheckBox cb5 = (CheckBox) findViewById(R.id.checkBox5);
                CheckBox cb6 = (CheckBox) findViewById(R.id.checkBox6);
                CheckBox cb7 = (CheckBox) findViewById(R.id.checkBox7);
                CheckBox cb8 = (CheckBox) findViewById(R.id.checkBox8);
                CheckBox cb9 = (CheckBox) findViewById(R.id.checkBox9);
                CheckBox cb10 = (CheckBox) findViewById(R.id.checkBox10);
                CheckBox cb11 = (CheckBox) findViewById(R.id.checkBox11);
                CheckBox cb12 = (CheckBox) findViewById(R.id.checkBox12);
                CheckBox cb13 = (CheckBox) findViewById(R.id.checkBox13);
                CheckBox cb14 = (CheckBox) findViewById(R.id.checkBox14);
                CheckBox cb15 = (CheckBox) findViewById(R.id.checkBox15);
                CheckBox cb16 = (CheckBox) findViewById(R.id.checkBox16);
                CheckBox cb17 = (CheckBox) findViewById(R.id.checkBox17);


                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_vaccine_page);
                final CheckBox cb1 = (CheckBox) findViewById(R.id.checkbox);
                cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (isChecked){
                            Toast.makeText(getApplicationContext(),buttonView.getText(),Toast.LENGTH_LONG).show();
                        }else{
                            Toast.makeText(getApplicationContext(),buttonView.getText(),Toast.LENGTH_LONG).show();

                        }
                    }
        });
        cb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(getApplicationContext(),buttonView.getText(),Toast.LENGTH_LONG).show();
                }
            }
        });
        cb3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(getApplicationContext(),buttonView.getText(),Toast.LENGTH_LONG).show();
                }
            }
        });
        cb4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(getApplicationContext(),buttonView.getText(),Toast.LENGTH_LONG).show();
                }
            }
        });
        cb5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(getApplicationContext(),buttonView.getText(),Toast.LENGTH_LONG).show();
                }
            }
        });
        cb6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(getApplicationContext(),buttonView.getText(),Toast.LENGTH_LONG).show();
                }
            }
        });
        cb7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(getApplicationContext(),buttonView.getText(),Toast.LENGTH_LONG).show();
                }
            }
        });
        cb8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(getApplicationContext(),buttonView.getText(),Toast.LENGTH_LONG).show();
                }
            }
        });
        cb9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(getApplicationContext(),buttonView.getText(),Toast.LENGTH_LONG).show();
                }
            }
        });
        cb10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(getApplicationContext(),buttonView.getText(),Toast.LENGTH_LONG).show();
                }
            }
        });
        cb11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(getApplicationContext(),buttonView.getText(),Toast.LENGTH_LONG).show();
                }
            }
        });
        cb12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(getApplicationContext(),buttonView.getText(),Toast.LENGTH_LONG).show();
                }
            }
        });
        cb13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(getApplicationContext(),buttonView.getText(),Toast.LENGTH_LONG).show();
                }
            }
        });
        cb14.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(getApplicationContext(),buttonView.getText(),Toast.LENGTH_LONG).show();
                }
            }
        });
        cb15.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(getApplicationContext(),buttonView.getText(),Toast.LENGTH_LONG).show();
                }
            }
        });
        cb16.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(getApplicationContext(),buttonView.getText(),Toast.LENGTH_LONG).show();
                }
            }
        });
        cb17.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(getApplicationContext(),buttonView.getText(),Toast.LENGTH_LONG).show();
                }
            }
        });

    }


    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkbox:
                if (checked) {

                }
                // Put some meat on the sandwich
                else
                    // Remove the meat
                    break;
            case R.id.checkBox2:
                if (checked) {

                }
                // Cheese me
                else
                    // I'm lactose intolerant
                    break;

            case R.id.checkBox3:
                if (checked) {

                }
                // Put some meat on the sandwich
                else
                    // Remove the meat
                    break;

            case R.id.checkBox4:
                if (checked) {

                }
                // Put some meat on the sandwich
                else
                    // Remove the meat
                    break;

            case R.id.checkBox5:
                if (checked) {

                }
                // Put some meat on the sandwich
                else
                    // Remove the meat
                    break;
            case R.id.checkBox6:
                if (checked) {

                }
                // Put some meat on the sandwich
                else
                    // Remove the meat
                    break;
            case R.id.checkBox7:
                if (checked) {

                }
                // Put some meat on the sandwich
                else
                    // Remove the meat
                    break;
            case R.id.checkBox8:
                if (checked) {

                }
                // Put some meat on the sandwich
                else
                    // Remove the meat
                    break;
            case R.id.checkBox9:
                if (checked) {

                }
                // Put some meat on the sandwich
                else
                    // Remove the meat
                    break;
            case R.id.checkBox10:
                if (checked) {

                }
                // Put some meat on the sandwich
                else
                    // Remove the meat
                    break;
            case R.id.checkBox11:
                if (checked) {

                }
                // Put some meat on the sandwich
                else
                    // Remove the meat
                    break;
            case R.id.checkBox12:
                if (checked) {

                }
                // Put some meat on the sandwich
                else
                    // Remove the meat
                    break;
            case R.id.checkBox13:
                if (checked) {

                }
                // Put some meat on the sandwich
                else
                    // Remove the meat
                    break;
            case R.id.checkBox14:
                if (checked) {

                }
                // Put some meat on the sandwich
                else
                    // Remove the meat
                    break;
            case R.id.checkBox15:
                if (checked) {

                }
                // Put some meat on the sandwich
                else
                    // Remove the meat
                    break;
            case R.id.checkBox16:
                if (checked) {

                }
                // Put some meat on the sandwich
                else
                    // Remove the meat
                    break;
            case R.id.checkBox17:
                if (checked) {

                }
                // Put some meat on the sandwich
                else
                    // Remove the meat
                    break;

                // TODO: Veggie sandwich
        }
    }
}