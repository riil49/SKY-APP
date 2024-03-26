package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class contact extends AppCompatActivity {
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        b = findViewById(R.id.buttonrolla);
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i = new Intent(contact.this, contactusActivity.class);
                startActivity(i);
            }
        });

        b = findViewById(R.id.buttonReham);
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i = new Intent(contact.this, contactus_rehamActivity.class);
                startActivity(i);
            }
        });

        b = findViewById(R.id.buttonKhadija);
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i = new Intent(contact.this, contactus_KhadijaActivity2.class);
                startActivity(i);
            }
        });
    }
}