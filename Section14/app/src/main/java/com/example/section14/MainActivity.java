package com.example.section14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox box;
    RadioGroup radioGroup;
    Spinner spinner;
    TimePicker timePicker;
    DatePicker datePicker;
    Button button;

    ProgressBar progressBar;
    int progress=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //CheckBox
//        box=findViewById((R.id.checkBox));
//        box.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if(isChecked){
//                    Toast.makeText(MainActivity.this,
//                            "the checkbox is checked",
//                            Toast.LENGTH_SHORT).show();
//                }else{
//                    Toast.makeText(MainActivity.this,
//                            "the checkbox is not checked",
//                            Toast.LENGTH_SHORT).show();
//                }
//            }
//        });

        //RadioButton
//        radioGroup=findViewById(R.id.radiogroup);
//        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                RadioButton radioButton=findViewById(checkedId);
//                Toast.makeText(MainActivity.this,
//                        "you selected "+radioButton.getText().toString(),
//                        Toast.LENGTH_SHORT).show();
//            }
//        });

        // spinner---->

//        spinner=findViewById(R.id.spinner);
//        String[] course={"c++", "java", "kotlin", "python"};
//
//        //ArrayAdapter: used to populate the spinner with items
//        //              from a string array resource
//
//        ArrayAdapter<String> adapter=new ArrayAdapter<>(
//                this,
//                android.R.layout.simple_spinner_item,
//                course
//        );
//        //apply the adapter to the spinner
//        spinner.setAdapter(adapter);

        //TimePicker
//        timePicker=findViewById(R.id.timepicker);
//        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
//            @Override
//            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
//                // handle time change
//                Toast.makeText(MainActivity.this,
//                        "hour: "+hourOfDay+" minute: "+minute,
//                        Toast.LENGTH_LONG).show();
//            }
//        });

        datePicker=findViewById(R.id.datepicker);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int  day= datePicker.getDayOfMonth();
                int month= datePicker.getMonth();
                int year= datePicker.getYear();
//                String day="day "+datePicker.getDayOfMonth();
//                String month="month "+datePicker.getMonth();
//                String year="year "+datePicker.getYear();
                Toast.makeText(MainActivity.this,
                        day+":"+(month+1)+":"+year,
                        Toast.LENGTH_SHORT).show();
            }
        });
//        datePicker.setOnDateChangedListener(new DatePicker.OnDateChangedListener() {
//            @Override
//            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
//                Toast.makeText(MainActivity.this,
//                         dayOfMonth+":"+(monthOfYear+1)+":"+year,
//                        Toast.LENGTH_SHORT).show();
//            }
//        });

//        progressBar=findViewById(R.id.progressbar);
//        button=findViewById(R.id.button);
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                progress=progress+10;
//                progressBar.setProgress(progress);
//            }
//        });

    }
}