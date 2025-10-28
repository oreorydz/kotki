package com.example.kotki;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {

    int wyswietlaneZdj=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button nastepneZdj = findViewById(R.id.next);
        Button poprzednieZdj = findViewById(R.id.prev);
        EditText ktoreZdj = findViewById(R.id.ktoryObraz);
        ImageView zdjecie = findViewById(R.id.imageView);
        Switch niebkieskieTlo = findViewById(R.id.tloNiebkieskie);

        ArrayList<Integer> zdjecia = new ArrayList<>();

        zdjecia.add(R.drawable.kot1);
        zdjecia.add(R.drawable.kot2);
        zdjecia.add(R.drawable.kot3);
        zdjecia.add(R.drawable.kot4);

        int iloscZdjec = zdjecia.size();
        nastepneZdj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (wyswietlaneZdj<zdjecia.size()-1){
                    wyswietlaneZdj++;
                    zdjecie.setImageResource(zdjecia.get(wyswietlaneZdj));
                } else if (wyswietlaneZdj==zdjecia.size()-1) {
                    zdjecie.setImageResource(zdjecia.get(0));
                    wyswietlaneZdj=0;
                }
            }
        });

        poprzednieZdj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (wyswietlaneZdj>0){
                    wyswietlaneZdj--;
                    zdjecie.setImageResource(zdjecia.get(wyswietlaneZdj));
                } else if (wyswietlaneZdj==0) {
                    zdjecie.setImageResource(zdjecia.get(4));
                    wyswietlaneZdj=4;
                }
            }
        });
    }
}