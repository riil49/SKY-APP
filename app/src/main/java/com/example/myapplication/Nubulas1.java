package com.example.myapplication;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.ImageView;
        import android.widget.TextView;

public class Nubulas1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nubulas1);
        Intent intent = getIntent();
        items2 itm2 = intent.getParcelableExtra("1");
        int Image = itm2.getImage();
        String items = itm2.getItems();
        String subItems = itm2.getSubItems();

        ImageView imageView = findViewById(R.id.imageViewN);
        imageView.setImageResource(Image);

        TextView textView1 =findViewById(R.id.titelN);
        textView1.setText(items);

        TextView textView =findViewById(R.id.Ndec);
        textView.setText(subItems);

    }
    public void con(View v){
        Intent r=new Intent(Nubulas1.this,Nubulas1.class);
        startActivity(r);
    }
}