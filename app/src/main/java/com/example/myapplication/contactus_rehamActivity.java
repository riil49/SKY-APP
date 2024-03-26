package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class contactus_rehamActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus_reham);
    }
    public void con(View v){
        Intent r=new Intent(contactus_rehamActivity.this,hoooommme.class);
        startActivity(r);
    }
}