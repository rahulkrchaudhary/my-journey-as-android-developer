package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridview;
    ArrayList<Shape> shapeArrayList;
    MyCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridview.findViewById(R.id.gridview);
        shapeArrayList=new ArrayList<>();

        Shape s1= new Shape(R.drawable.sphere, "Sphere");
        Shape s2= new Shape(R.drawable.cylinder, "Cylinder");
        Shape s3 =new Shape(R.drawable.cube, "cube");
        Shape s4= new Shape(R.drawable.prism, "prism");

        shapeArrayList.add(s1);
        shapeArrayList.add(s2);
        shapeArrayList.add(s3);
        shapeArrayList.add(s4);

        adapter=new MyCustomAdapter(shapeArrayList, getApplicationContext());
        gridview.setAdapter(adapter);
        gridview.setNumColumns(2);

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i= new Intent(getApplicationContext(), Sphere.class);
                startActivity(i);
            }
        });
    }
}