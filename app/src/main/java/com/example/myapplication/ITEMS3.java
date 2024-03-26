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


public class ITEMS3 extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items3);

        listView = findViewById(R.id.listPlanets);

        ArrayList<items2> arrayList = new ArrayList<>();


        arrayList.add(new items2(R.drawable.erth, "Erath", "Earth is the third planet from the Sun and the only astronomical object known to harbor life.\n" +
                "    This is enabled by Earth being a water world, the only one in the Solar System sustaining liquid surface water.\n" +
                "Almost all of Earth's water is contained in its global ocean, covering 70.8% of Earth's crust"));


        arrayList.add(new items2(R.drawable.venus, "Venus", "Venus is the second planet from the Sun. It has the densest\n" +
                "    atmosphere of all rocky bodies in the Solar System, so dense that at surface level and 92\n" +
                "    atmospheres, it is a supercritical fluid. The planet's surface is dominated by volcanoes –\n" +
                "    there are 167 Venusian volcanoes that are over 100 km across."));


        arrayList.add(new items2(R.drawable.mercury, "Mercury", "Mercury is the first planet from the Sun and the smallest in the Solar System.\n" +
                " \\n The surface of Mercury is heavily cratered, as a result of countless impact events that\n" +
                "    have accumulated over billions of years. Its largest crater, Caloris Planitia, has a diameter\n" +
                "    of 1,550 km and one-third the diameter of the planet."));


        arrayList.add(new items2(R.drawable.mars, "Mars", "Mars is the fourth planet from the Sun. The surface of Mars is orange-red because it is covered in iron(III) oxide dust,\n" +
                "giving it the nickname (the Red Planet). \n" +
                "Mars hosts many enormous extinct volcanos and one of the largest canyons in the Solar System. For comparison, Mars's diameter is 6,779 km."));


        arrayList.add(new items2(R.drawable.jupiter, "Jupiter", "Jupiter is the fifth planet from the Sun and the largest in the Solar System. \\n\n" +
                "It is a gas giant with a mass more than two and a half times that of all the other planets in the Solar System combined,\n" +
                "and slightly less than one one-thousandth the mass of the Sun\n"));


        arrayList.add(new items2(R.drawable.saturn, "Saturn", "Saturn is the sixth planet from the Sun and the second-largest in the Solar System, after Jupiter. It is a gas giant with an average radius of about nine-and-a-half times that of Earth.\\n\n" +
                "It has only one-eighth the average density of Earth, but is over 95 times more massive."));

        arrayList.add(new items2(R.drawable.uranus, "Uranus", "Uranus is the seventh planet from the Sun.\n" +
                "It is a gaseous cyan-coloured ice giant. Most of the planet is made of water, ammonia, and methane in a supercritical phase of matter, which in astronomy is called 'ice' or volatiles."));

        arrayList.add(new items2(R.drawable.neptune, "Neptune", "Neptune is the eighth and farthest planet from the Sun. \\n\n" +
                "It is the fourth-largest planet in the Solar System by diameter, the third-most-massive planet,\n" +
                "and the densest giant planet. It is 17 times the mass of Earth, and slightly more massive than its near-twin Uranus."));



        adabter adabter = new adabter(ITEMS3.this, R.layout.recycler_item, arrayList);
        listView.setAdapter(adabter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(ITEMS3.this,detailActivity.class);
                intent.putExtra("1",arrayList.get(position));
                startActivity(intent);

            }
        });  }
    public void con(View v){
        Intent r=new Intent(ITEMS3.this,hoooommme.class);
        startActivity(r);
    }}







