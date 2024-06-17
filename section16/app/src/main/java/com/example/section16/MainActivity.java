package com.example.section16;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //listview is adapter view
        listView=findViewById(R.id.listView);

        //data source:-array, arraylist
        String[] countries={"India", "USA", "London", "Germany"};

        //adapter: acts as a bridge between the data source and adapter view
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(
//                this,
//                android.R.layout.simple_list_item_1,
//                countries
//        );

        //custom adapter
        MyCustomAdapter adapter =new MyCustomAdapter(this, countries);

        // link listview with the adapter
        listView.setAdapter(adapter);



    }
}