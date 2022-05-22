package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class AlphabetsActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets);
    }


    public void btnOnClick(View view) {
        String id = view.getTransitionName();
        Intent intent = new Intent(AlphabetsActivity.this, ActivityA.class);
        intent.putExtra("id",id);
        startActivity(intent);
    }

    public void backOnClick(View view) {
        Intent intent = new Intent(AlphabetsActivity.this, MainActivity.class);
        startActivity(intent);
    }
}