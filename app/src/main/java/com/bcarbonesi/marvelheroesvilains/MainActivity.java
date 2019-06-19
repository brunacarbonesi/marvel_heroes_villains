package com.bcarbonesi.marvelheroesvilains;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonHeroes;
    Button buttonVillains;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonHeroes = findViewById(R.id.buttonHeroes);
        buttonVillains = findViewById(R.id.buttonVillains);

        buttonHeroes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, HeroesList.class);
                startActivity(intent);

            }
        });

        buttonVillains.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, VillainsList.class);
                startActivity(intent);

            }
        });
    }
}
