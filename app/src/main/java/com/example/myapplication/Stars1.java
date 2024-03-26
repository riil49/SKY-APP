package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Stars1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stars1);
        Intent intent = getIntent();
        items2 itm2 = intent.getParcelableExtra("1");
        int Image = itm2.getImage();
        String items = itm2.getItems();
        String subItems = itm2.getSubItems();

        ImageView imageView = findViewById(R.id.imageViewStars);
        imageView.setImageResource(Image);

        TextView textView1 =findViewById(R.id.titelS);
        textView1.setText(items);

        TextView textView =findViewById(R.id.sdes);
        textView.setText(subItems);

    }
    public void con(View v){
        Intent r=new Intent(Stars1.this,STARS.class);
        startActivity(r);
    }
}









