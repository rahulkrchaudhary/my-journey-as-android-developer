package com.example.luckynumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText editText;
    String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.btn);
        editText=findViewById(R.id.edittext);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    username=editText.getText().toString().toLowerCase();
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "enter name", Toast.LENGTH_SHORT).show();
                }
//                explicit intent
                Intent i = new Intent(getApplicationContext(), SecondActivity.class);
//                passing the name to second activity
                i.putExtra("name", username);
                //it is used to pass input from 1st component to second component
                     //this method is used to include additional data within intent
//                it is used to pass additional data to other intent component like here to second activity
                startActivity(i);
            }
        });
    }
}