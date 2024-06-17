package com.example.luckynumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {
    Button btn;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btn=findViewById(R.id.btn);
        textView=findViewById(R.id.textView2);

        //how to recive data from main activity to second activity
        Intent i = getIntent(); //it is used to get data from main activity
        String username = i.getStringExtra("name"); //storing data

        int luckynum=generateNum();
        textView.setText(""+luckynum);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareData(username, luckynum);
            }
        });

    }
    //generting random number
    public int generateNum() {
        Random random = new Random();
        int upperlimit=100;
        int randomnum= random.nextInt(upperlimit);
        return randomnum;
    }

    public void shareData(String username, int luckynum){
        //implicit intent
        Intent i = new Intent(Intent.ACTION_SEND); //ACTION_SEND-it is used to share content to other device and component
        i.setType("text/plain");

        //additional info
        i.putExtra(Intent.EXTRA_SUBJECT,username +" got lucky today !");
        //
        i.putExtra(Intent.EXTRA_TEXT, username+ " lucky number is: "+luckynum);
        startActivity(Intent.createChooser(i,"choose a platform"));
        //it is utility provider that allow us to create a dialog box that display list of application that can be handled
        //it is used to give choice to user to use application among many application
    }



}