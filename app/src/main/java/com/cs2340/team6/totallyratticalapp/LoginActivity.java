package com.cs2340.team6.totallyratticalapp;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

public class LoginActivity extends AppCompatActivity {

    EditText etPassword;
    EditText etUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        /*final EditText */etUsername = (EditText) findViewById(R.id.etUsername);
        /*final EditText */etPassword = (EditText) findViewById(R.id.etPassword);

        final Button loginButton = (Button) findViewById(R.id.loginButton);
        final TextView tvSignUpLink = (TextView) findViewById(R.id.tvSignUpLink);

//        tvSignUpLink.setOnClickListener(new View.OnClickListener());
//            @Override
//            public void onClick(View v) {
//
//        }
    }

    public void onCancelPressed(View v){
        etPassword.setText("");
        etUsername.setText("");
        Intent intent = new Intent(this, WelcomeActivity.class);
        startActivity(intent);
    }

    public void onRegisterPressed(View v) {
        etPassword.setText("");
        etUsername.setText("");
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

    public void onLoginPressed(View v) {
        if (etUsername.getText().toString().equals("user") && etPassword.getText().toString().equals("pass")) {
            Intent intent = new Intent(this, AppActivity.class);
            startActivity(intent);
        }
        else {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("I ain't know you");
            AlertDialog dialogue = builder.create();
            dialogue.show();
        }
    }

    @Override
    public void onBackPressed() {

    }
}
