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

        createParcours = findViewById(R.id.menu_button_create_parcours);
        parcoursPredefini = findViewById(R.id.menu_button_parcours_predefinis);
        mesParcours = findViewById(R.id.menu_button_mes_parcours);

        createParcoursLabel = findViewById(R.id.menu_createParcours);
        parcoursPredefiniLabel = findViewById(R.id.menu_parcourspredefini);
        mesParcoursLabel = findViewById(R.id.menu_mesParcours);



    }

    public void goToCreate(View v) {
        Intent i = new Intent(MenuPrincipal.this, createParcoursActivity.class);
    }

    public void goToPredefini(View v) {
        Intent i = new Intent(MenuPrincipal.this, parcoursPredefiniActivity.class);
    }

    public void goToMesParcours(View v) {
        Intent i = new Intent(MenuPrincipal.this, mesParcoursActivity.class);
    }
}
