package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class ActivityA extends AppCompatActivity {
    String id1;
    ImageView imgVw1;
    ImageView imgVw2;
    ImageView imgVw3;
    ImageView imgVw4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        id1 = getIntent().getStringExtra("id");
        setContentView(R.layout.activity_activity);
        imgVw1 = (ImageView)findViewById(R.id.imageView1);
        imgVw2 = (ImageView)findViewById(R.id.imageView2);
        imgVw3 = (ImageView)findViewById(R.id.imageView3);
        imgVw4 = (ImageView)findViewById(R.id.imageView3);
        if(id1.equals("a"))
        {
            imgVw1.setImageResource(R.drawable.a1);
            imgVw2.setImageResource(R.drawable.a2);
            imgVw3.setImageResource(R.drawable.a3);
            imgVw4.setImageResource(R.drawable.a4);
        }
        else if(id1.equals("b"))
        {
            imgVw1.setImageResource(R.drawable.b1);
            imgVw2.setImageResource(R.drawable.b2);
            imgVw3.setImageResource(R.drawable.b3);
            imgVw4.setImageResource(R.drawable.b4);
        }
        else if(id1.equals("c"))
        {
            imgVw1.setImageResource(R.drawable.c1);
            imgVw2.setImageResource(R.drawable.c2);
            imgVw3.setImageResource(R.drawable.c3);
            imgVw4.setImageResource(R.drawable.c4);
        }
        else if(id1.equals("d"))
        {
            imgVw1.setImageResource(R.drawable.d1);
            imgVw2.setImageResource(R.drawable.d2);
            imgVw3.setImageResource(R.drawable.d3);
            imgVw4.setImageResource(R.drawable.d4);
        }
        else if(id1.equals("e"))
        {
            imgVw1.setImageResource(R.drawable.e1);
            imgVw2.setImageResource(R.drawable.e2);
            imgVw3.setImageResource(R.drawable.e3);
            imgVw4.setImageResource(R.drawable.e4);
        }
        else if(id1.equals("f"))
        {
            imgVw1.setImageResource(R.drawable.f1);
            imgVw2.setImageResource(R.drawable.f2);
            imgVw3.setImageResource(R.drawable.f3);
            imgVw4.setImageResource(R.drawable.f4);
        }
        else if(id1.equals("g"))
        {
            imgVw1.setImageResource(R.drawable.g1);
            imgVw2.setImageResource(R.drawable.g2);
            imgVw3.setImageResource(R.drawable.g3);
            imgVw4.setImageResource(R.drawable.g4);
        }
        else if(id1.equals("h"))
        {
            imgVw1.setImageResource(R.drawable.h1);
            imgVw2.setImageResource(R.drawable.h2);
            imgVw3.setImageResource(R.drawable.h3);
            imgVw4.setImageResource(R.drawable.h4);
        }
        else if(id1.equals("b"))
        {
            imgVw1.setImageResource(R.drawable.b1);
            imgVw2.setImageResource(R.drawable.b2);
            imgVw3.setImageResource(R.drawable.b3);
            imgVw4.setImageResource(R.drawable.b4);
        }
        else if(id1.equals("b"))
        {
            imgVw1.setImageResource(R.drawable.b1);
            imgVw2.setImageResource(R.drawable.b2);
            imgVw3.setImageResource(R.drawable.b3);
            imgVw4.setImageResource(R.drawable.b4);
        }
        else if(id1.equals("b"))
        {
            imgVw1.setImageResource(R.drawable.b1);
            imgVw2.setImageResource(R.drawable.b2);
            imgVw3.setImageResource(R.drawable.b3);
            imgVw4.setImageResource(R.drawable.b4);
        }
        else if(id1.equals("b"))
        {
            imgVw1.setImageResource(R.drawable.b1);
            imgVw2.setImageResource(R.drawable.b2);
            imgVw3.setImageResource(R.drawable.b3);
            imgVw4.setImageResource(R.drawable.b4);
        }
        else if(id1.equals("b"))
        {
            imgVw1.setImageResource(R.drawable.b1);
            imgVw2.setImageResource(R.drawable.b2);
            imgVw3.setImageResource(R.drawable.b3);
            imgVw4.setImageResource(R.drawable.b4);
        }
        else if(id1.equals("b"))
        {
            imgVw1.setImageResource(R.drawable.b1);
            imgVw2.setImageResource(R.drawable.b2);
            imgVw3.setImageResource(R.drawable.b3);
            imgVw4.setImageResource(R.drawable.b4);
        }
        else if(id1.equals("b"))
        {
            imgVw1.setImageResource(R.drawable.b1);
            imgVw2.setImageResource(R.drawable.b2);
            imgVw3.setImageResource(R.drawable.b3);
            imgVw4.setImageResource(R.drawable.b4);
        }
        else if(id1.equals("b"))
        {
            imgVw1.setImageResource(R.drawable.b1);
            imgVw2.setImageResource(R.drawable.b2);
            imgVw3.setImageResource(R.drawable.b3);
            imgVw4.setImageResource(R.drawable.b4);
        }
        else if(id1.equals("b"))
        {
            imgVw1.setImageResource(R.drawable.b1);
            imgVw2.setImageResource(R.drawable.b2);
            imgVw3.setImageResource(R.drawable.b3);
            imgVw4.setImageResource(R.drawable.b4);
        }
        else if(id1.equals("b"))
        {
            imgVw1.setImageResource(R.drawable.b1);
            imgVw2.setImageResource(R.drawable.b2);
            imgVw3.setImageResource(R.drawable.b3);
            imgVw4.setImageResource(R.drawable.b4);
        }
        else if(id1.equals("b"))
        {
            imgVw1.setImageResource(R.drawable.b1);
            imgVw2.setImageResource(R.drawable.b2);
            imgVw3.setImageResource(R.drawable.b3);
            imgVw4.setImageResource(R.drawable.b4);
        }
        else if(id1.equals("b"))
        {
            imgVw1.setImageResource(R.drawable.b1);
            imgVw2.setImageResource(R.drawable.b2);
            imgVw3.setImageResource(R.drawable.b3);
            imgVw4.setImageResource(R.drawable.b4);
        }
        else if(id1.equals("b"))
        {
            imgVw1.setImageResource(R.drawable.b1);
            imgVw2.setImageResource(R.drawable.b2);
            imgVw3.setImageResource(R.drawable.b3);
            imgVw4.setImageResource(R.drawable.b4);
        }
        else if(id1.equals("b"))
        {
            imgVw1.setImageResource(R.drawable.b1);
            imgVw2.setImageResource(R.drawable.b2);
            imgVw3.setImageResource(R.drawable.b3);
            imgVw4.setImageResource(R.drawable.b4);
        }
        else if(id1.equals("b"))
        {
            imgVw1.setImageResource(R.drawable.b1);
            imgVw2.setImageResource(R.drawable.b2);
            imgVw3.setImageResource(R.drawable.b3);
            imgVw4.setImageResource(R.drawable.b4);
        }
        else if(id1.equals("b"))
        {
            imgVw1.setImageResource(R.drawable.b1);
            imgVw2.setImageResource(R.drawable.b2);
            imgVw3.setImageResource(R.drawable.b3);
            imgVw4.setImageResource(R.drawable.b4);
        }
        else if(id1.equals("b"))
        {
            imgVw1.setImageResource(R.drawable.b1);
            imgVw2.setImageResource(R.drawable.b2);
            imgVw3.setImageResource(R.drawable.b3);
            imgVw4.setImageResource(R.drawable.b4);
        }
        else if(id1.equals("b"))
        {
            imgVw1.setImageResource(R.drawable.b1);
            imgVw2.setImageResource(R.drawable.b2);
            imgVw3.setImageResource(R.drawable.b3);
            imgVw4.setImageResource(R.drawable.b4);
        }
    }



}