package com.example.layout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//    Activity life cycle of app:-->

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        Toast.makeText(this, "OnCreate() is called", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onStart() {
//        super.onStart();
//        Toast.makeText(this,
//                "OnStart() is called",
//                Toast.LENGTH_SHORT).show();
////        it is good to show some animation and text message while it is starting
//
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        Toast.makeText(this,
//                "OnResume() is called",
//                Toast.LENGTH_SHORT).show();
////        when activity is forground and ready for user interaction
////        sensor and location update
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Toast.makeText(this,
//                "OnPause() is called",
//                Toast.LENGTH_SHORT).show();
////
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Toast.makeText(this,
//                "OnStop() is called",
//                Toast.LENGTH_SHORT).show();
////        release resources, save data, etc...
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        Toast.makeText(this,
//                "OnRestart() is called",
//                Toast.LENGTH_SHORT).show();
//
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Toast.makeText(this,
//                "OnDestroy() is called",
//                Toast.LENGTH_SHORT).show();
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        intents: facilitates communication b/w different components of app
//        as well as b/w different app

//        types of intents:
//        1. explicit Intents
//        2. Implicit intents

//        explicit intens: it is used to facilitates communication within andriod studio
//        like from mainActivity to secondActivety
        Button btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                goToSecondActivity();
            }
        });

        //  implicit intent: it is used to facilitates communication with other application like web page

        Button webbtn=findViewById(R.id.mybtn);
        webbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openWebPage();
            }
        });



    }
    public void goToSecondActivity(){
        Intent intent=new Intent(this, SecondActivity.class);
        startActivity(intent);

    }
    public void openWebPage(){
        Uri webpage= Uri.parse("https://www.google.com/");
//        Uri=uniform resoursce identifier: used to identify resource such as file and webpage
        Intent intent=new Intent(Intent.ACTION_VIEW,webpage);
        startActivity(intent);
    }


}