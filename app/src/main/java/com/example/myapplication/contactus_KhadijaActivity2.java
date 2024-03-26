package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class contactus_KhadijaActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus_khadija2);
    }
    public void con(View v){
        Intent r=new Intent(contactus_KhadijaActivity2.this,hoooommme.class);
        startActivity(r);
    }
}