package com.example.loginfrom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView email, password;
    Button button ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        password = findViewById(R.id.pas);
        email = findViewById(R.id.ema);
        button = findViewById(R.id.button);

      button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              if (!email.getText().toString().equals("admin")) {
                  email.setError("Enter valid username");
              }
              if (!password.getText().toString().equals("admin")) {
                  password.setError("Enter correct password");
              }
          }
      });
    }


}