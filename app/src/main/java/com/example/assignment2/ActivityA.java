package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
        imgVw4 = (ImageView)findViewById(R.id.imageView4);
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
        else if(id1.equals("i"))
        {
            imgVw1.setImageResource(R.drawable.i1);
            imgVw2.setImageResource(R.drawable.i2);
            imgVw3.setImageResource(R.drawable.i3);
            imgVw4.setImageResource(R.drawable.i4);
        }
        else if(id1.equals("j"))
        {
            imgVw1.setImageResource(R.drawable.j1);
            imgVw2.setImageResource(R.drawable.j2);
            imgVw3.setImageResource(R.drawable.j3);
            imgVw4.setImageResource(R.drawable.j4);
        }
        else if(id1.equals("k"))
        {
            imgVw1.setImageResource(R.drawable.k1);
            imgVw2.setImageResource(R.drawable.k2);
            imgVw3.setImageResource(R.drawable.k3);
            imgVw4.setImageResource(R.drawable.k4);
        }
        else if(id1.equals("l"))
        {
            imgVw1.setImageResource(R.drawable.l1);
            imgVw2.setImageResource(R.drawable.l2);
            imgVw3.setImageResource(R.drawable.l3);
            imgVw4.setImageResource(R.drawable.l4);
        }
        else if(id1.equals("m"))
        {
            imgVw1.setImageResource(R.drawable.m1);
            imgVw2.setImageResource(R.drawable.m2);
            imgVw3.setImageResource(R.drawable.m3);
            imgVw4.setImageResource(R.drawable.m4);
        }
        else if(id1.equals("n"))
        {
            imgVw1.setImageResource(R.drawable.n1);
            imgVw2.setImageResource(R.drawable.n2);
            imgVw3.setImageResource(R.drawable.n3);
            imgVw4.setImageResource(R.drawable.n4);
        }
        else if(id1.equals("o"))
        {
            imgVw1.setImageResource(R.drawable.o1);
            imgVw2.setImageResource(R.drawable.o2);
            imgVw3.setImageResource(R.drawable.o3);
            imgVw4.setImageResource(R.drawable.o4);
        }
        else if(id1.equals("p"))
        {
            imgVw1.setImageResource(R.drawable.p1);
            imgVw2.setImageResource(R.drawable.p2);
            imgVw3.setImageResource(R.drawable.p3);
            imgVw4.setImageResource(R.drawable.p4);
        }
        else if(id1.equals("q"))
        {
            imgVw1.setImageResource(R.drawable.q1);
            imgVw2.setImageResource(R.drawable.q2);
            imgVw3.setImageResource(R.drawable.q3);
            imgVw4.setImageResource(R.drawable.q4);
        }
        else if(id1.equals("r"))
        {
            imgVw1.setImageResource(R.drawable.r1);
            imgVw2.setImageResource(R.drawable.r2);
            imgVw3.setImageResource(R.drawable.r3);
            imgVw4.setImageResource(R.drawable.r4);
        }
        else if(id1.equals("s"))
        {
            imgVw1.setImageResource(R.drawable.s1);
            imgVw2.setImageResource(R.drawable.s2);
            imgVw3.setImageResource(R.drawable.s3);
            imgVw4.setImageResource(R.drawable.s4);
        }
        else if(id1.equals("t"))
        {
            imgVw1.setImageResource(R.drawable.t1);
            imgVw2.setImageResource(R.drawable.t2);
            imgVw3.setImageResource(R.drawable.t3);
            imgVw4.setImageResource(R.drawable.t4);
        }
        else if(id1.equals("u"))
        {
            imgVw1.setImageResource(R.drawable.u1);
            imgVw2.setImageResource(R.drawable.u2);
            imgVw3.setImageResource(R.drawable.u3);
            imgVw4.setImageResource(R.drawable.u4);
        }
        else if(id1.equals("v"))
        {
            imgVw1.setImageResource(R.drawable.v1);
            imgVw2.setImageResource(R.drawable.v2);
            imgVw3.setImageResource(R.drawable.v3);
            imgVw4.setImageResource(R.drawable.v4);
        }
        else if(id1.equals("w"))
        {
            imgVw1.setImageResource(R.drawable.w1);
            imgVw2.setImageResource(R.drawable.w2);
            imgVw3.setImageResource(R.drawable.w3);
            imgVw4.setImageResource(R.drawable.w4);
        }
        else if(id1.equals("x"))
        {
            imgVw1.setImageResource(R.drawable.x1);
            imgVw2.setImageResource(R.drawable.x2);
            imgVw3.setImageResource(R.drawable.x3);
            imgVw4.setImageResource(R.drawable.x4);
        }
        else if(id1.equals("y"))
        {
            imgVw1.setImageResource(R.drawable.y1);
            imgVw2.setImageResource(R.drawable.y2);
            imgVw3.setImageResource(R.drawable.y3);
            imgVw4.setImageResource(R.drawable.y4);
        }
        else if(id1.equals("z"))
        {
            imgVw1.setImageResource(R.drawable.z1);
            imgVw2.setImageResource(R.drawable.z2);
            imgVw3.setImageResource(R.drawable.z3);
            imgVw4.setImageResource(R.drawable.z4);
        }
    }
    public void backOnClick(View view) {
        Intent intent = new Intent(ActivityA.this, AlphabetsActivity.class);
        startActivity(intent);
    }



}