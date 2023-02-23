package com.example.mysqlsignuplogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {

    TextView loginBtnTextView,skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        loginBtnTextView = findViewById(R.id.login_text_view_btn);
        loginBtnTextView.setOnClickListener(v-> startActivity(new Intent(SignUp.this, LogIn.class)));

        skip = findViewById(R.id.skipp);
        skip.setOnClickListener(v -> startActivity(new Intent(SignUp.this,MainActivity.class)));

    }
}