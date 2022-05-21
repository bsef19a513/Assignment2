package com.example.assignment2;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startOnClick(View view) {
        Intent intent = new Intent(MainActivity.this, AlphabetsActivity.class);
        startActivity(intent);
    }

    public void quizOnClick(View view) {
    }

    public void repositoryOnClick(View view) {
        String url = "https://github.com/BSEF19A513/Assignment2";
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }
}