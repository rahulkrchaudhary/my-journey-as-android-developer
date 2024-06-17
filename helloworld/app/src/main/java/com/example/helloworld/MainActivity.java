package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView myclass = findViewById(R.id.mytextView);
        myclass.setText("hii whats up!!");

        EditText mytext=findViewById(R.id.editText);
        String inputtext=mytext.getText().toString();
        System.out.println(inputtext);

        Button mybtn=findViewById(R.id.button);
        mybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                this code will be executed when the button is clicked
                Toast.makeText(MainActivity.this,"you clicked the button", Toast.LENGTH_SHORT).show();

            }
        });
    }
}