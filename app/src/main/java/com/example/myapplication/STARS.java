package com.example.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class STARS extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stars);
        listView = findViewById(R.id.listStras);
        ArrayList<items2> arrayList = new ArrayList<>();

        arrayList.add(new items2(R.drawable.orions_belt, "Orion’s Belt", "Orion’s Belt is a prominent asterism formed by three stars in the constellation Orion. The three bright blue stars – Alnitak, Alnilam, and Mintaka – outline the belt in the constellation figure of the celestial Hunter. Appearing as three stars in a row, Orion’s Belt stars lie more than 1,000 light-years away and are among the brightest stars in the sky."));
        arrayList.add(new items2(R.drawable.alcyone, "Alcyone", "Alcyone is a star located in the Pleiades star cluster, also known as the Seven Sisters. The Pleiades is a group of hot, young stars situated in the constellation Taurus. Alcyone is one of the brightest stars in this cluster and holds significance in various cultures and mythologies.\n" +
                "In terms of its characteristics, Alcyone is a blue-white giant star with a spectral type of B7III. It is approximately 370 light-years away from Earth. The star is relatively young, with an estimated age of around 100 million years."));
        arrayList.add(new items2(R.drawable.alpha_centauri, "Alpha Centauri", "Alpha Centauri is a star system with components 4.2 to 4.4 light-years from Earth and comprises three stars. It is the closest star system to the solar system, and one of its stars is the nearest star to our planet other than the sun. \n" +
                "Collectively, the star system is the fourth-brightest star in Earth's sky (not including the sun), after Sirius, Canopus and Arcturus , Alpha Centauri is a southern star, located in the constellation Centaurus, and thus isn't visible to observers above 29 degrees north latitude."));
        arrayList.add(new items2(R.drawable.vega, "Viga", "vega , brightest star in the northern constellation Lyra and fifth brightest in the night sky, with a visual magnitude of 0.03. It is also one of the Sun’s closer neighbours, at a distance of about 25 light-years. Vega’s spectral type is A (white) and its luminosity class V (main sequence). It will become the northern polestar by about AD 14,000 because of the precession of the equinoxes. Vega is surrounded by a disk of circumstellar dust that may be similar to the solar system’s Kuiper Belt."));

        adabter adabter = new adabter(STARS.this, R.layout.recycler_item, arrayList);
        listView.setAdapter(adabter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(STARS.this,detailActivity.class);
                intent.putExtra("1",arrayList.get(position));
                startActivity(intent);
            }
        }); }
    public void con(View v){
        Intent r=new Intent(STARS.this,hoooommme.class);
        startActivity(r);
    }

}







