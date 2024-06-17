package com.example.sportapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // 1- adapter view
    private RecyclerView recyclerView;

    // 2- data source
    private List<Sport> sportList;

    // 3- adapter
    private CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);
        sportList=new ArrayList<>();

        Sport s1=new Sport("badminton",R.drawable.badminton);
        Sport s2=new Sport("cricket",R.drawable.cricket);
        Sport s3=new Sport("golf",R.drawable.golf);
        Sport s4=new Sport("hockey",R.drawable.hockey);
        Sport s5=new Sport("football",R.drawable.football);
        Sport s6=new Sport("kabaddi",R.drawable.kabaddi);
        Sport s7=new Sport("kho kho",R.drawable.khokho);
        Sport s8=new Sport("tennis",R.drawable.tennis);
        Sport s9=new Sport("table tennis",R.drawable.tte);
        Sport s10=new Sport("volley ball",R.drawable.volleyball);

        sportList.add(s1);
        sportList.add(s2);
        sportList.add(s3);
        sportList.add(s4);
        sportList.add(s5);
        sportList.add(s6);
        sportList.add(s7);
        sportList.add(s8);
        sportList.add(s9);
        sportList.add(s10);

        customAdapter=new CustomAdapter(sportList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(customAdapter);

    }
}