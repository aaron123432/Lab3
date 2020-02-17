package com.temple.edu.coloractivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<String> list = new ArrayList<>();
        list.add("Please choose a color");
        list.add("RED");
        list.add("YELLOW");
        list.add("BLUE");
        list.add("GREEN");
        list.add("GRAY");
        list.add("BLACK");
        list.add("CYAN");
        list.add("MAGENTA");
        list.add("DARKGREY");
        list.add("AQUA");


        final ColorAdapter adapter = new ColorAdapter(list, this);
        final Spinner spinner = findViewById(R.id.spinner);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ConstraintLayout layout = findViewById(R.id.Layout);
                if(position != 0){
                    layout.setBackgroundColor(Color.parseColor(list.get(position)));
                    findViewById((int)adapter.getItemId(position)).setBackgroundColor(Color.parseColor("WHITE"));
                }else{
                    layout.setBackgroundColor(Color.parseColor("WHITE"));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
