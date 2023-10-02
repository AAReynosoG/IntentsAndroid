package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.intents.MainActivity2;
import com.example.intents.R;
import com.example.intents.MainActivity2;

public class MainActivity extends AppCompatActivity {

    Button B, B2;



    CountDownTimer ctimer = null;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.txt2);


        // B = findViewById(R.id.b1);
        //B.setOnClickListener(this);
        // B2 = findViewById(R.id.b2);
        // B2.setOnClickListener(this);

        StartTimer();
    }


    final Context context = this;
    public void StartTimer() {
        ctimer = new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long segundos) {
                txt.setText("" + segundos / 1000);
            }

            @Override
            public void onFinish() {
                txt.setText("Let's go!");
                Intent i = new Intent(context, MainActivity2.class);
                startActivity(i);
            }
        };

        ctimer.start();
    }

    /* @Override
    public void onClick(View view) {

        if (view.getId() == R.id.b1){
            Intent  i=new Intent(this, MainActivity2.class);
            startActivity(i);
        } else if (view.getId() == R.id.b2) {
            Intent i2 = new Intent(this, MainActivity3.class);
            startActivity(i2);
        }

    }*/
}