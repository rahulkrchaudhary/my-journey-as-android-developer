package com.example.greetingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edittext;
    Button mybtn;
    TextView title;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext = findViewById(R.id.edittext);
        mybtn = findViewById(R.id.button);
        title = findViewById(R.id.textview);

        mybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputname=edittext.getText().toString();
                Toast.makeText(MainActivity.this, "Welcome "+inputname +" to our App", Toast.LENGTH_SHORT).show();
            }
        });


    }
}