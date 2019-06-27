package com.erkanmericmert.babycontroller;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QuerySnapshot;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Map;

import javax.annotation.Nullable;

public class HomeNav extends AppCompatActivity

        implements NavigationView.OnNavigationItemSelectedListener {

    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView kidView;
    ImageView kidView2;
    ImageView kidView3;
    ImageView plusView;
    TextView kid1Text;
    TextView kid2Text;
    TextView kid3Text;
    TextView addKidText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_nav);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        plusView = findViewById(R.id.plusView);
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        kidView = findViewById(R.id.kidView);
        kidView2 = findViewById(R.id.kidView2);
        kidView3 = findViewById(R.id.kidView3);
        kid1Text = findViewById(R.id.kid1Text);
        kid2Text = findViewById(R.id.kid2Text);
        kid3Text = findViewById(R.id.kid3Text);
        addKidText = findViewById(R.id.addKidText);


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        Parent parent = new Parent("name", "deneme2@gmail.com", "42RFnu3rzoOvmsvKUunmeB2pfcT2");
        //Integer babySize = parent.getNumberOfBabies();
        Integer babySize = 3;
        if (babySize == 0){
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            kidView.setVisibility(View.INVISIBLE);
            kidView2.setVisibility(View.INVISIBLE);
            kidView3.setVisibility(View.INVISIBLE);
            kid1Text.setVisibility(View.INVISIBLE);
            kid2Text.setVisibility(View.INVISIBLE);
            kid3Text.setVisibility(View.INVISIBLE);
        } else if(babySize == 1){
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            kidView2.setVisibility(View.INVISIBLE);
            kidView3.setVisibility(View.INVISIBLE);
            kid2Text.setVisibility(View.INVISIBLE);
            kid3Text.setVisibility(View.INVISIBLE);
        } else if (babySize == 2){
            imageView3.setVisibility(View.INVISIBLE);
            kidView3.setVisibility(View.INVISIBLE);
            kid3Text.setVisibility(View.INVISIBLE);
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home_nav, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.profil){
            Intent intent = new Intent(getApplicationContext(),navProfil.class);
            startActivity(intent);
        } else if (item.getItemId() == R.id.signOut){
            FirebaseAuth.getInstance().signOut();
            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            Intent intent = new Intent(getApplicationContext(),HomeNav.class);
            startActivity(intent);
            // Handle the camera action
        } else if (id == R.id.nav_babycontroller) {
            Intent intent = new Intent(getApplicationContext(),navBebekKontrol.class);
            startActivity(intent);
        } else if (id == R.id.nav_calender) {
            Intent intent = new Intent(getApplicationContext(),navTakvim.class);
            startActivity(intent);
        } else if (id == R.id.nav_story) {
            Intent intent = new Intent(getApplicationContext(),navMelodi.class);
            startActivity(intent);
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void kidData(View view){
        Intent intent = new Intent(getApplicationContext(),navBebekKontrol.class);
        startActivity(intent);
    }

    public void addKid(View view){
        Intent intent = new Intent(getApplicationContext(),navCocukEkle.class);
        startActivity(intent);
    }
}
