package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

public class QuizActivity extends AppCompatActivity {
    int count = 0;
    int obtainedMarks = 0;
    int totalMarks = 5;
    RadioButton rdBtn1;
    RadioButton rdBtn2;
    RadioButton rdBtn3;
    RadioButton rdBtn4;
    ImageView imgVw1;
    Button checkbtn;
    Button nextbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        imgVw1 = (ImageView) findViewById(R.id.imgView1);
        rdBtn1 = (RadioButton) findViewById(R.id.radioButton1);
        rdBtn2 = (RadioButton) findViewById(R.id.radioButton2);
        rdBtn3 = (RadioButton) findViewById(R.id.radioButton3);
        rdBtn4 = (RadioButton) findViewById(R.id.radioButton4);
        switch (count)
        {
            case 0:
            imgVw1.setImageResource(R.drawable.quiz1);
            rdBtn1.setText("A");
            rdBtn2.setText("B");
            rdBtn3.setText("C");
            rdBtn4.setText("D");
        }
    }

    public void checkOnClick(View view) {
    }

    public void nextOnClick(View view) {
        count++;
    }
}