package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Sphere extends AppCompatActivity {
    EditText editText1, editText2;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);

        editText1.findViewById(R.id.editText);
        editText2.findViewById(R.id.editText2);
        button.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String radius = editText1.getText().toString();
                double r = Double.parseDouble(radius);
                double volume = (4/3)*3.14*r*r*r;
                editText2.setText(volume+"m^3");
            }
        });


    }
}