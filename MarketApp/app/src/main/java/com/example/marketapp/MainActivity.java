package com.example.marketapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Item> itemList;
    MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);
        itemList= new ArrayList<>();

        Item item1 = new Item(R.drawable.fruits, "Fruits", "fresh fruit from garden");
        Item item2 = new Item(R.drawable.bakery, "Bakery", "breads & bakery products");
        Item item3 = new Item(R.drawable.beverage, "Beverage", "cold and soft drinks");
        Item item4 = new Item(R.drawable.dairy, "Dairy", "milk and milkproducts");
        Item item5 = new Item(R.drawable.grocery, "Vegetables", "fresh vegetables");
        Item item6 = new Item(R.drawable.snacks, "Snacks", "biscuits and evening snacks");

        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        itemList.add(item6);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        myAdapter = new MyAdapter(itemList);
        recyclerView.setAdapter(myAdapter);
    }
}