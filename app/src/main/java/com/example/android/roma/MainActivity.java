package com.example.android.roma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textViewBazilike;
    TextView textViewFontaneTrgovi;
    TextView textViewParkovi;
    TextView textViewZnamenitosti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewBazilike = findViewById(R.id.tv_baziike);
        textViewFontaneTrgovi = findViewById(R.id.trgovi);
        textViewParkovi = findViewById(R.id.tv_parkovi);
        textViewZnamenitosti = findViewById(R.id.tv_znamenitosti);

        textViewBazilike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,BazilikeActivity.class );
                startActivity(intent);
            }
        });

        textViewFontaneTrgovi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TrgoviActivity.class);
                startActivity(intent);
            }
        });

        textViewParkovi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MainActivity.this, ParkoviActivity.class);
                startActivity(intent);
            }
        });

        textViewZnamenitosti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ZnamenitostiActivity.class);
                startActivity(intent);
            }
        });




    }

}
