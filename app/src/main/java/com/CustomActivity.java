package com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.assignment2.Alphabet;
import com.example.assignment2.MyViewAdapter;
import com.example.assignment2.R;

import java.util.ArrayList;

public class CustomActivity extends AppCompatActivity {
    ListView listview1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alphabetview);
        ArrayList<Alphabet> alphabetArrayList = new ArrayList<Alphabet>();
        alphabetArrayList.add(new Alphabet("A","a",R.drawable.a3));
        alphabetArrayList.add(new Alphabet("B","b",R.drawable.b3));
        alphabetArrayList.add(new Alphabet("C","c",R.drawable.c3));
        alphabetArrayList.add(new Alphabet("D","d",R.drawable.d3));
        alphabetArrayList.add(new Alphabet("E","e",R.drawable.e3));
        alphabetArrayList.add(new Alphabet("F","f",R.drawable.f3));
        alphabetArrayList.add(new Alphabet("G","g",R.drawable.g3));
        alphabetArrayList.add(new Alphabet("H","h",R.drawable.h3));
        alphabetArrayList.add(new Alphabet("I","i",R.drawable.i3));
        alphabetArrayList.add(new Alphabet("J","j",R.drawable.j3));
        alphabetArrayList.add(new Alphabet("K","k",R.drawable.k3));
        alphabetArrayList.add(new Alphabet("L","l",R.drawable.l3));
        alphabetArrayList.add(new Alphabet("M","m",R.drawable.m3));
        alphabetArrayList.add(new Alphabet("N","n",R.drawable.n3));
        alphabetArrayList.add(new Alphabet("O","o",R.drawable.o3));
        alphabetArrayList.add(new Alphabet("P","p",R.drawable.p3));
        alphabetArrayList.add(new Alphabet("Q","q",R.drawable.q3));
        alphabetArrayList.add(new Alphabet("R","r",R.drawable.r3));
        alphabetArrayList.add(new Alphabet("S","s",R.drawable.s3));
        alphabetArrayList.add(new Alphabet("T","t",R.drawable.t3));
        alphabetArrayList.add(new Alphabet("U","u",R.drawable.u3));
        alphabetArrayList.add(new Alphabet("V","v",R.drawable.v3));
        alphabetArrayList.add(new Alphabet("W","w",R.drawable.w3));
        alphabetArrayList.add(new Alphabet("X","x",R.drawable.x3));
        alphabetArrayList.add(new Alphabet("Y","y",R.drawable.y3));
        alphabetArrayList.add(new Alphabet("Z","z",R.drawable.z3));

        MyViewAdapter adapter = new MyViewAdapter(this, alphabetArrayList);
        listview1 = findViewById(R.id.listview3);
        listview1.setAdapter(adapter);
    }
}