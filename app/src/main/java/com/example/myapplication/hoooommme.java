package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class hoooommme extends AppCompatActivity {
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoooommme);
        b = findViewById(R.id.buttonplanets);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(hoooommme.this, ITEMS3.class);
                startActivity(i);} });
        b = findViewById(R.id.buttonStars);
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(hoooommme.this, STARS.class);
                startActivity(i); } });
        b = findViewById(R.id.buttonssddaa);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(hoooommme.this, Nubulas.class);
                startActivity(i);} });
        b = findViewById(R.id.buttonssdda);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(hoooommme.this, Natural_phenomena.class);
                startActivity(i);} });
    }
}


