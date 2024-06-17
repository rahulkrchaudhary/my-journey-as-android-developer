package com.example.unitconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edittext1, edittext2;
    Button mybtn;
    TextView textView;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] unit ={"area", "data transfer rate", "digital storage", "energy", "frequency","fuel economy"," length", "mass", "plane angle", "pressure",
        "speed", "temperature", "time", "volume"};

        ArrayAdapter<String> spinneradapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_dropdown_item, unit);
        spinner.setAdapter(spinneradapter);






        edittext1 = findViewById(R.id.edit1);
        edittext2 = findViewById(R.id.edit2);
        mybtn = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        mybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num = 0;
                try {
                    String input = edittext1.getText().toString();
                    num = Double.parseDouble(input);
                } catch (NumberFormatException ex) {
                    Toast.makeText(MainActivity.this, "Input is Invalid", Toast.LENGTH_SHORT).show();
                }
                double ans = makeConverstation(num);
                edittext2.setText("" + ans+ " Pound");
            }
        });
    }

    public double makeConverstation(double numkg) {
        return 2.20462*numkg;
    }
}
