
package com.example.myapplication;


        import androidx.appcompat.app.AppCompatActivity;


        import android.annotation.SuppressLint;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;

        import android.widget.AdapterView;
        import android.widget.ImageButton;


        import android.widget.ListView;




        import java.util.ArrayList;

public class Natural_phenomena extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_natural_phenomena);
        listView = findViewById(R.id.listNatural_phenomena);
        ArrayList<items2> arrayList = new ArrayList<>();
        arrayList.add(new items2(R.drawable.meteorite, "Meteorite", "A meteorite is a solid piece of debris from space, such as a comet, asteroid, or meteoroid, that survives its fiery passage through the Earth's atmosphere and lands on the planet's surface.\\nMeteorites can vary in size, shape, and composition. They provide valuable insights into the early solar system and are often studied by scientists to understand the formation and evolution of celestial bodies. Discovering a meteorite on Earth is like finding a piece of space that has journeyed through the cosmos and arrived on our planet."));

        arrayList.add(new items2(R.drawable.meteors, "Meteors", "Meteors are streaks of light in the night sky caused by the entry of small celestial objects, called meteoroids, into the Earth's atmosphere. As these meteoroids travel through the air, they heat up due to friction, creating a bright trail of light known as a meteor or (shooting star) Most meteors are tiny particles, and they burn up completely before reaching the Earth's surface.\n" +
                "\n" +
                "Meteor showers occur when the Earth passes through the debris left behind by comets, resulting in an increased number of meteors visible in the night sky. Witnessing a meteor shower can be a captivating and awe-inspiring experience, as these fleeting streaks of light zip across the darkness, leaving a momentary trail of brilliance."));
        arrayList.add(new items2(R.drawable.auroraborealisa, "Aurora Borealis", "The Aurora Borealis, or Northern Lights, is like a celestial dance of colors in the night sky. \nIt occurs when the sun's particles meet the Earth's magnetic field and create a stunning light show. Imagine vibrant curtains of green, pink, and purple lights gracefully moving across the northern horizon. \nIt's a magical spectacle that paints the night sky with nature's own dazzling brush."));

        adabter adabter = new adabter(Natural_phenomena.this, R.layout.recycler_item, arrayList);
        listView.setAdapter(adabter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(Natural_phenomena.this, detailActivity.class);
                intent.putExtra("1",arrayList.get(position));
                startActivity(intent);

            }
        }); }
    public void con(View v){
        Intent r=new Intent(Natural_phenomena.this,hoooommme.class);
        startActivity(r);
    }

}







