package com.example.assignment2;

import static android.graphics.Color.rgb;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {
    int currentIndex = 0;
    int obtainedMarks = 0;
    int totalMarks = 5;
    TextView result;
    RadioButton rdBtn1;
    RadioButton rdBtn2;
    RadioButton rdBtn3;
    RadioButton rdBtn4;
    ImageView imgVw1;
    int []questions = {R.drawable.a4,R.drawable.b3,R.drawable.d4,R.drawable.k3,R.drawable.r3};
    String choices[][] = {
            {"A","B","C","D"},
            {"A","B","C","D"},
            {"A","B","C","D"},
            {"J","K","L","M"},
            {"P","Q","R","S"}
    };
    char [] answers = {'A','B','D','K','R'};
    Button checkbtn;
    Button nextbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        result = (TextView) findViewById(R.id.txtResult);
        imgVw1 = (ImageView) findViewById(R.id.imgView1);
        nextbtn = (Button) findViewById(R.id.btnNext);
        rdBtn1 = (RadioButton) findViewById(R.id.radioButton1);
        rdBtn2 = (RadioButton) findViewById(R.id.radioButton2);
        rdBtn3 = (RadioButton) findViewById(R.id.radioButton3);
        rdBtn4 = (RadioButton) findViewById(R.id.radioButton4);
        imgVw1.setImageResource(questions[currentIndex]);
        rdBtn1.setText(choices[currentIndex][0]);
        rdBtn2.setText(choices[currentIndex][1]);
        rdBtn3.setText(choices[currentIndex][2]);
        rdBtn4.setText(choices[currentIndex][3]);
//        imgVw1.setImageResource(R.drawable.a4);
//        rdBtn1.setText("A");
//        rdBtn2.setText("B");
//        rdBtn3.setText("C");
//        rdBtn4.setText("D");

    }

    public void checkOnClick(View view) {
        if(currentIndex==0&&rdBtn1.isChecked())
        {
            result.setText("Correct");
            result.setTextColor(rgb(0,128,0));
            obtainedMarks++;
        }
        else if (currentIndex==1&&rdBtn2.isChecked())
        {
            result.setText("Correct");
            result.setTextColor(rgb(0,128,0));
            obtainedMarks++;
        }
        else if (currentIndex==2&&rdBtn4.isChecked())
        {
            result.setText("Correct");
            result.setTextColor(rgb(0,128,0));
            obtainedMarks++;
        }
        else if (currentIndex==3&&rdBtn4.isChecked())
        {
            result.setText("Correct");
            result.setTextColor(rgb(0,128,0));
            obtainedMarks++;
        }
        else if (currentIndex==4&&rdBtn3.isChecked())
        {
            result.setText("Correct");
            result.setTextColor(rgb(0,128,0));
            obtainedMarks++;
        }
        else
        {
           result.setText("Wrong");
           result.setTextColor(rgb(128,0,0));
        }

    }

    public void nextOnClick(View view) {
        currentIndex++;
        switch (currentIndex)
        {
            case 1:
                imgVw1.setImageResource(R.drawable.b3);
                rdBtn1.setText("C");
                rdBtn2.setText("B");
                rdBtn3.setText("E");
                rdBtn4.setText("D");
                break;
            case 2:
                imgVw1.setImageResource(R.drawable.d4);
                rdBtn1.setText("A");
                rdBtn2.setText("B");
                rdBtn3.setText("C");
                rdBtn4.setText("D");
                break;
            case 3:
                imgVw1.setImageResource(R.drawable.k3);
                rdBtn1.setText("E");
                rdBtn2.setText("G");
                rdBtn3.setText("I");
                rdBtn4.setText("K");
                break;
            case 4:
                imgVw1.setImageResource(R.drawable.r3);
                rdBtn1.setText("W");
                rdBtn2.setText("Y");
                rdBtn3.setText("R");
                rdBtn4.setText("Z");
                nextbtn.setText("Finish");
                break;
            case 5:
                Toast toast = Toast.makeText(this,"Test has been finished",Toast.LENGTH_LONG);
                toast.show();
                new AlertDialog.Builder(this)
                        .setMessage("Score is: "+obtainedMarks+"/"+totalMarks)
//                        .setCancelable(false)
                        .show();
                nextbtn.setText("Return");
                break;
            case 6:
                Intent intent = new Intent(QuizActivity.this,MainActivity.class);
                startActivity(intent);
        }
        result.setText("");
    }

}