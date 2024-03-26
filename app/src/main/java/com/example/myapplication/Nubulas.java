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
public class Nubulas extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nubulas);

        listView = findViewById(R.id.listNubulas);
        ArrayList<items2> arrayList = new ArrayList<>();

        arrayList.add(new items2(R.drawable.img_2, "NGC 6302", "NGC 6302(also known as the Bug Nebula, Butterfly Nebula, or Caldwell 69) is a bipolar planetary nebula in the constellation Scorpius. The structure in the nebula is among the most complex ever observed in planetary nebulae. The spectrum of NGC 6302 shows that its central star is one of the hottest stars known, with a surface temperature in excess of 250,000 degrees Celsius, implying that the star from which it formed must have been very large.\n" +
                "\n" +
                "The central star, a white dwarf, was identified in 2009, using the upgraded Wide Field Camera 3 on board the Hubble Space Telescope.The star has a current mass of around 0.64 solar masses. "));

        arrayList.add(new items2(R.drawable.orionnebula, "Orion Nebula", "The Orion Nebula is one of the most scrutinized and photographed objects in the night sky and is among the most intensely studied celestial features. The nebula has revealed much about the process of how stars and planetary systems are formed from collapsing clouds of gas and dust. \\n\n" +
                "Astronomers have directly observed protoplanetary disks and brown dwarfs within the nebula, intense and turbulent motions of the gas, and the photo-ionizing effects of massive nearby stars in the nebula."));

        arrayList.add(new items2(R.drawable.dumbbellnebula, "Dumbbell Nebula", "The Dumbbell Nebula(also known as the Apple Core Nebula, Messier 27, and NGC 6853) is a planetary nebula (nebulosity surrounding a white dwarf) in the constellation Vulpecula, at a distance of about 1360 light-years.\n" +
                "It was the first such nebula to be discovered, by Charles Messier in 1764. At its brightness of visual magnitude 7.5 and diameter of about 8 arcminutes, it is easily visible in binoculars and is a popular observing target in amateur telescopes."));

        arrayList.add(new items2(R.drawable.darknebula, "Dark Nebula", "A dark nebula or absorption nebula is a type of interstellar cloud, particularly molecular clouds, that is so dense that it obscures the visible wavelengths of light from objects behind it, such as background stars and emission or reflection nebulae.\n" +
                "The extinction of the light is caused by interstellar dust grains located in the coldest, densest parts of molecular clouds. Clusters and large complexes of dark nebulae are associated with Giant Molecular Clouds. Isolated small dark nebulae are called Bok globules. Like other interstellar dust or material, things it obscures are only visible using radio waves in radio astronomy or infrared in infrared astronomy."));

        adabter adabter = new adabter(Nubulas.this, R.layout.recycler_item, arrayList);
        listView.setAdapter(adabter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(Nubulas.this, detailActivity.class);
                intent.putExtra("1",arrayList.get(position));
                startActivity(intent);} });
    }     public void con(View v){
        Intent r=new Intent(Nubulas.this,hoooommme.class);
        startActivity(r);
    }}







