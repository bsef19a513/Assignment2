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
        setContentView(R.layout.activity_custom);
        ArrayList<Alphabet> alphabetArrayList = new ArrayList<Alphabet>();
        alphabetArrayList.add(new Alphabet('A','a',R.drawable.a3));
        alphabetArrayList.add(new Alphabet('B','b',R.drawable.b3));
        alphabetArrayList.add(new Alphabet('C','c',R.drawable.c3));
        alphabetArrayList.add(new Alphabet('D','d',R.drawable.d3));
        MyViewAdapter adapter = new MyViewAdapter(this,0, alphabetArrayList);
        listview1 = findViewById(R.id.listview2);
        listview1.setAdapter(adapter);
    }
}