package com.cs2340.team6.totallyratticalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);

        final Button loginButton = (Button) findViewById(R.id.loginButton);
        final TextView tvSignUpLink = (TextView) findViewById(R.id.tvSignUpLink);

//        tvSignUpLink.setOnClickListener(new View.OnClickListener());
//            @Override
//            public void onClick(View v) {
//
//        }
    }
}
