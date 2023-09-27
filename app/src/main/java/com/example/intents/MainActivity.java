package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.a8botones.MainActivity2;
import com.example.a8botones.R;
import com.example.intents.MainActivity2;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button B, B2, B3, B4, B5, B6, B7, B8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        B = findViewById(R.id.b1);
        B2 = findViewById(R.id.b2);
        B3 = findViewById(R.id.b3);
        B4 = findViewById(R.id.b4);

        B.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        Intent  i=new Intent(this, MainActivity2.class);
        startActivity(i);

    }
}