package com.zakin.minutabdo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MenuPrincipal extends AppCompatActivity {

    private Button createParcours;
    private Button parcoursPredefini;
    private Button mesParcours;

    private TextView createParcoursLabel;
    private TextView parcoursPredefiniLabel;
    private TextView mesParcoursLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        createParcours = (Button) findViewById(R.id.menu_button_create_parcours);
        parcoursPredefini = (Button) findViewById(R.id.menu_button_parcours_predefinis);
        mesParcours = (Button) findViewById(R.id.menu_button_mes_parcours);

        createParcoursLabel = (TextView) findViewById(R.id.menu_createParcours);
        parcoursPredefiniLabel = (TextView) findViewById(R.id.menu_parcourspredefini);
        mesParcoursLabel = (TextView) findViewById(R.id.menu_mesParcours);

        createParcours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuPrincipal.this, createParcoursActivity.class);
                startActivity(i);
            }
        });

        createParcoursLabel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuPrincipal.this, createParcoursActivity.class);
                startActivity(i);
            }
        });

        parcoursPredefini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuPrincipal.this, parcoursPredefiniActivity.class);
                startActivity(i);
            }
        });

        parcoursPredefiniLabel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuPrincipal.this, parcoursPredefiniActivity.class);
                startActivity(i);
            }
        });

        mesParcours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuPrincipal.this, mesParcoursActivity.class);
                startActivity(i);
            }
        });

        mesParcoursLabel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuPrincipal.this, mesParcoursActivity.class);
                startActivity(i);
            }
        });

    }

    public void goToCreate(View v) {
        Intent i = new Intent(MenuPrincipal.this, createParcoursActivity.class);
        startActivity(i);
    }

    public void goToPredefini(View v) {
        Intent i = new Intent(MenuPrincipal.this, parcoursPredefiniActivity.class);
        startActivity(i);
    }

    public void goToMesParcours(View v) {
        Intent i = new Intent(MenuPrincipal.this, mesParcoursActivity.class);
        startActivity(i);
    }
}
