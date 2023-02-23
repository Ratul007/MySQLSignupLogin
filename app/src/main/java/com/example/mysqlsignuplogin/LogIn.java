package com.example.mysqlsignuplogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LogIn extends AppCompatActivity {

    TextView createAccountBtnTextView,skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        createAccountBtnTextView = findViewById(R.id.create_account_text_view_btn);
        createAccountBtnTextView.setOnClickListener((v)-> startActivity(new Intent(LogIn.this, SignUp.class)));

        skip = findViewById(R.id.skipp);
        skip.setOnClickListener((v)-> startActivity(new Intent(LogIn.this,MainActivity.class)));
    }
}