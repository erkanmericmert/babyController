package com.erkanmericmert.babycontroller;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class navBebekKontrol extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, AdapterView.OnItemSelectedListener {

    private Spinner spinner;
    private static final String[] paths = {"1.Hafta", "2.Hafta", "3.Hafta", "4.Hafta", "2.Ay", "3.Ay", "4.Ay", "5.Ay", "6.Ay", "7.Ay", "8.Ay","9.Ay", "10.Ay", "11.Ay", "1 Yaş", "1,5 Yaş", "2 yaş"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav_bebek_kontrol);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        spinner = (Spinner)findViewById(R.id.spinner2);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(navBebekKontrol.this,
                android.R.layout.simple_spinner_item,paths);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

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
        getMenuInflater().inflate(R.menu.nav_bebek_kontrol, menu);
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

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void babyShow(View view){
        Intent intent = new Intent(getApplicationContext(),babyDetails.class);
        startActivity(intent);
    }

    public void goToVaccine(View view){
        Intent intent = new Intent(getApplicationContext(),VaccinePage.class);
        startActivity(intent);
    }

    //Baby cocuk1 = name Baby("cocuk1 isim", "Kan grubu", "cinsiyet");
    //Baby cocuk2 = name Baby("cocuk2 isim", "Kan grubu", "cinsiyet");
}
