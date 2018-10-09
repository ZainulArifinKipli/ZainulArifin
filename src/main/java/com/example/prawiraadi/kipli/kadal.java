package com.example.prawiraadi.kipli;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class kadal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kadal);
    }
    public void back2 (View view){
        Intent intent = new Intent(this, kipli.class);
        startActivity(intent);

    }
}
