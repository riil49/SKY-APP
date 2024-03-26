
package com.example.myapplication;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.ImageView;
        import android.widget.TextView;

public class detailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
        items2 itm2 = intent.getParcelableExtra("1");
        int Image = itm2.getImage();
        String items = itm2.getItems();
        String subItems = itm2.getSubItems();

        ImageView imageView = findViewById(R.id.imageView66);
        imageView.setImageResource(Image);

        TextView textView1 =findViewById(R.id.titelE);
        textView1.setText(items);

        TextView textView =findViewById(R.id.Edec);
        textView.setText(subItems);



    }

}