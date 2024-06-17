package com.example.planetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Planet> planetArrayList;
    private static MyCustomAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // adapter view
        listView= findViewById(R.id.listview);

        // data source
        planetArrayList= new ArrayList<>();
        Planet planet1 = new Planet("earth", "1 Moon", R.drawable.earth);
        Planet planet2 = new Planet(" mercury", "0 moon", R.drawable.mercury);
        Planet planet3 = new Planet("venus", "0 moon", R.drawable.venus);
        Planet planet4 = new Planet("mars", "2 moon", R.drawable.mars);
        Planet planet5 = new Planet("jupiter", "79 moon", R.drawable.jupiter);
        Planet planet6 = new Planet("saturn", "83 moon", R.drawable.saturn);
        Planet planet7 = new Planet("uranus", "27 moon", R.drawable.uranus);
        Planet planet8 = new Planet("neptune", "14 moon", R.drawable.neptune);
//        Planet planet9 = new Planet(" ", "1", R.drawable.earth);


        planetArrayList.add(planet1);
        planetArrayList.add(planet2);
        planetArrayList.add(planet3);
        planetArrayList.add(planet4);
        planetArrayList.add(planet5);
        planetArrayList.add(planet6);
        planetArrayList.add(planet7);
        planetArrayList.add(planet8);
//        planetArrayList.add(planet9);

        adapter = new MyCustomAdapter(planetArrayList, getApplicationContext());

         listView.setAdapter(adapter);

        //handling click events
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,
                        "Planet name"+adapter.getItem(position).getPlanetName(),
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}