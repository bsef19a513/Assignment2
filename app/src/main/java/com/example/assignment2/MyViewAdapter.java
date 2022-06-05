package com.example.assignment2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.assignment2.Alphabet;
import com.example.assignment2.R;

import java.util.ArrayList;

public class MyViewAdapter extends ArrayAdapter<Alphabet> {
    public MyViewAdapter(@NonNull Context context, @NonNull ArrayList<Alphabet> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Alphabet alpha = getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.alphabetview,parent,false);
        TextView txtVwCap = convertView.findViewById(R.id.txtVwCap);
        TextView txtVwSmall = convertView.findViewById(R.id.txtVwSmall);
        ImageView imgView = convertView.findViewById(R.id.imgView1);
        txtVwCap.setText(alpha.capital);
        txtVwSmall.setText(alpha.small);
        imgView.setImageResource(alpha.imageID);
        return convertView;
    }
}
