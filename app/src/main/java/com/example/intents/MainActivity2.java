package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {


    Button B1E, B2E;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        B1E = findViewById(R.id.be1);
        B2E = findViewById(R.id.be2);

        B1E.setOnClickListener(this);
        B2E.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){

        if(view.getId() == R.id.be1){
            Intent i = new Intent(this, MainActivity3.class);
            startActivity(i);
        } else if (view.getId() == R.id.be2) {
            Intent i2 = new Intent(this, MainActivity.class);
            startActivity(i2);
        }
        //MVVM Modelo Vista Vista Modelo
    }
}