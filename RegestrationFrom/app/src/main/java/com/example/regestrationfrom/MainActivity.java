package com.example.regestrationfrom;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText email, password;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.emailField);
        password = findViewById(R.id.passwordField);
        button = findViewById(R.id.register);

        button.setOnClickListener(view -> {
            validate();

            if (email.getText().toString().equals("mohit") && password.getText().toString().equals("mohit")){
                Log.d("tag", "Login is Working");
                Toast.makeText(getApplicationContext(),
                        "Login Successful...",Toast.LENGTH_SHORT).show();
            }
        });
    }
    void  validate() {
        if(TextUtils.isEmpty(email.getText())){
        Toast enterEmail = Toast.makeText(this, "Enter Email First", Toast.LENGTH_SHORT);
        enterEmail.show();
        }
        if (TextUtils.isEmpty(password.getText())){
            Toast enterPassword = Toast.makeText(this, "Please enter Password", Toast.LENGTH_SHORT);
            enterPassword.show();
        }
    }
}
