package com.example.practical_15;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView1, textView2, textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView1 = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value1 = extras.getString("name");
            String value2 = extras.getString("company");
            String value3 = extras.getString("year");
            textView1.setText(value1);
            textView2.setText(value2);
            textView3.setText(value3);
        }
    }
}