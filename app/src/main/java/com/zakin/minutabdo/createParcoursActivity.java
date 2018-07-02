package com.zakin.minutabdo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class createParcoursActivity extends AppCompatActivity {

    private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_parcours);

        b = findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent secondeActivite = new Intent(createParcoursActivity.this, MenuPrincipal.class);

                startActivity(secondeActivite);

            }
        });
    }
}
