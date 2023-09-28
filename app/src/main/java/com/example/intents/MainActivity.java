package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.intents.MainActivity2;
import com.example.intents.R;
import com.example.intents.MainActivity2;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button B, B2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        B = findViewById(R.id.b1);
        B.setOnClickListener(this);

        B2 = findViewById(R.id.b2);
        B2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Intent  i=new Intent(this, MainActivity2.class);
        startActivity(i);

    }
}