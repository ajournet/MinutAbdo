package com.zakin.minutabdo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MenuPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
    }

    public void goToCreate(View v) {
        Intent i = new Intent(this, createParcoursActivity.class);
        startActivity(i);
    }

    public void goToPredefini(View v) {
        Intent i = new Intent(this, parcoursPredefiniActivity.class);
        startActivity(i);
    }

    public void goToMesParcours(View v) {
        Intent i = new Intent(this, mesParcoursActivity.class);
        startActivity(i);
    }

}
