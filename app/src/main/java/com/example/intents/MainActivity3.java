package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {

    Button B1I, B2I, B3I, B4I;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        B1I = findViewById(R.id.bi1);
        B2I = findViewById(R.id.bi2);
        B3I = findViewById(R.id.bi3);
        B4I = findViewById(R.id.bi4);

        B1I.setOnClickListener(this);
        B2I.setOnClickListener(this);
        B3I.setOnClickListener(this);
        B4I.setOnClickListener(this);

    }

    @Override
    public void onClick(View view){

        if (view.getId() == R.id.bi1){
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.youtube.com"));
            startActivity(i);
        } else if (view.getId() == R.id.bi2) {
            Intent i2 = new Intent(Intent.ACTION_VIEW);
            i2.setData(Uri.parse("https://www.google.com"));
            startActivity(i2);
        } else if (view.getId() == R.id.bi3) {
            Intent i3 = new Intent(Intent.ACTION_VIEW);
            i3.setData(Uri.parse("https://api.hypixel.net/resources/games"));
            startActivity(i3);
        } else if (view.getId() == R.id.bi4) {
            Intent i4 = new Intent(Intent.ACTION_VIEW);
            i4.setData(Uri.parse("https://api.hypixel.net/resources/achievements"));
            startActivity(i4);
        }


    }
}