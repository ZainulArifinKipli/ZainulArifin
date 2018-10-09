package com.example.prawiraadi.kipli;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class paus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paus);
    }
    public void back3 (View view){
        Intent intent = new Intent(this, kipli.class);
        startActivity(intent);

    }
}
