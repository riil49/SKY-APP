package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity2 extends AppCompatActivity {
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        setContentView(R.layout.activity_login2);
        b = findViewById(R.id.buttoncontent);
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i = new Intent(LoginActivity2.this, contact.class);
                startActivity(i);

            }
        });
    }
    public void button_next(View v){
        Intent i=new Intent(LoginActivity2.this,hoooommme.class);
        startActivity(i);
    }

}






