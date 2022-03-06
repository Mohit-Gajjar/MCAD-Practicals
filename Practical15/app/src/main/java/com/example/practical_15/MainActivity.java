package com.example.practical_15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner = findViewById(R.id.spinner1);
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
                if (i == 0) {
                    intent.putExtra("name","Alto 800");
                    intent.putExtra("company","Maruti Suzuki");
                    intent.putExtra("year","16 October 2012");
                    startActivity(intent);
                } else if (i==1) {
                    intent.putExtra("name","Duster");
                    intent.putExtra("company","Renault");
                    intent.putExtra("year","");
                    startActivity(intent);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}