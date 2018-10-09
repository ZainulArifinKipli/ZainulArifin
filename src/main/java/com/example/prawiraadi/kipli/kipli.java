package com.example.prawiraadi.kipli;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class kipli extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kipli);
    }
    public void send1 (View view){
        Intent intent = new Intent(this, singa.class);
        startActivity(intent);

    }
    public void send2 (View view){
        Intent intent = new Intent(this, kadal.class);
        startActivity(intent);

    }
    public void send3 (View view){
        Intent intent = new Intent(this, paus.class);
        startActivity(intent);

    }
}
