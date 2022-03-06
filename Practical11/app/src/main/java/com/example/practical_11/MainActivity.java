package com.example.practical_11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1;
    EditText number2;
    Button Add_button;

    int ans=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // by ID we can use each component which id is assign in xml file
        number1=(EditText) findViewById(R.id.editText_first_no);
        number2=(EditText) findViewById(R.id.editText_second_no);
        Add_button=(Button) findViewById(R.id.add_button);


        Add_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                double sum = num1 + num2;
                String value="Hello world";
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("key",Double.toString(sum));
                startActivity(i);

            }
        });
    }
}