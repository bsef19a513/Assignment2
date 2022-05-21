package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AlphabetsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets);
    }

    public void AOnClick(View view) {
        Intent intent = new Intent(AlphabetsActivity.this, ActivityA.class);
        startActivity(intent);
    }
/*
    public void BOnClick(View view) {
        Intent intent = new Intent(AlphabetsActivity.this, ActivityB.class);
        startActivity(intent);
    }

    public void COnClick(View view) {
        Intent intent = new Intent(AlphabetsActivity.this, ActivityC.class);
        startActivity(intent);
    }
    public void DOnClick(View view) {
        Intent intent = new Intent(AlphabetsActivity.this, ActivityD.class);
        startActivity(intent);
    }

    public void EOnClick(View view) {
        Intent intent = new Intent(AlphabetsActivity.this, ActivityE.class);
        startActivity(intent);
    }

    public void FOnClick(View view) {
        Intent intent = new Intent(AlphabetsActivity.this, ActivityF.class);
        startActivity(intent);
    }
    public void GOnClick(View view) {
        Intent intent = new Intent(AlphabetsActivity.this, ActivityG.class);
        startActivity(intent);
    }

    public void HOnClick(View view) {
        Intent intent = new Intent(AlphabetsActivity.this, ActivityH.class);
        startActivity(intent);
    }

    public void IOnClick(View view) {
        Intent intent = new Intent(AlphabetsActivity.this, ActivityI.class);
        startActivity(intent);
    }
    public void JOnClick(View view) {
        Intent intent = new Intent(AlphabetsActivity.this, ActivityJ.class);
        startActivity(intent);
    }

    public void KOnClick(View view) {
        Intent intent = new Intent(AlphabetsActivity.this, ActivityK.class);
        startActivity(intent);
    }

    public void LOnClick(View view) {
        Intent intent = new Intent(AlphabetsActivity.this, ActivityL.class);
        startActivity(intent);
    }
    public void MOnClick(View view) {
        Intent intent = new Intent(AlphabetsActivity.this, ActivityM.class);
        startActivity(intent);
    }

    public void NOnClick(View view) {
        Intent intent = new Intent(AlphabetsActivity.this, ActivityN.class);
        startActivity(intent);
    }

    public void OOnClick(View view) {
        Intent intent = new Intent(AlphabetsActivity.this, ActivityO.class);
        startActivity(intent);
    }
    public void POnClick(View view) {
        Intent intent = new Intent(AlphabetsActivity.this, ActivityP.class);
        startActivity(intent);
    }

    public void QOnClick(View view) {
        Intent intent = new Intent(AlphabetsActivity.this, ActivityQ.class);
        startActivity(intent);
    }

    public void ROnClick(View view) {
        Intent intent = new Intent(AlphabetsActivity.this, ActivityR.class);
        startActivity(intent);
    }
    public void SOnClick(View view) {
        Intent intent = new Intent(AlphabetsActivity.this, ActivityS.class);
        startActivity(intent);
    }

    public void TOnClick(View view) {
        Intent intent = new Intent(AlphabetsActivity.this, ActivityT.class);
        startActivity(intent);
    }

    public void UOnClick(View view) {
        Intent intent = new Intent(AlphabetsActivity.this, ActivityU.class);
        startActivity(intent);
    }
    public void VOnClick(View view) {
        Intent intent = new Intent(AlphabetsActivity.this, ActivityV.class);
        startActivity(intent);
    }

    public void WOnClick(View view) {
        Intent intent = new Intent(AlphabetsActivity.this, ActivityW.class);
        startActivity(intent);
    }

    public void XOnClick(View view) {
        Intent intent = new Intent(AlphabetsActivity.this, ActivityX.class);
        startActivity(intent);
    }
    public void YOnClick(View view) {
        Intent intent = new Intent(AlphabetsActivity.this, ActivityY.class);
        startActivity(intent);
    }

    public void ZOnClick(View view) {
        Intent intent = new Intent(AlphabetsActivity.this, ActivityZ.class);
        startActivity(intent);
    }*/

    public void backOnClick(View view) {
        Intent intent = new Intent(AlphabetsActivity.this, MainActivity.class);
        startActivity(intent);
    }
}