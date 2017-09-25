package com.cs2340.team6.totallyratticalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class RegisterActivity extends AppCompatActivity {

    EditText etName;
    EditText etUsername;
    EditText etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        /*final EditText */etName = (EditText) findViewById(R.id.etName);
        /*final EditText */etUsername = (EditText) findViewById(R.id.etUsername);
        /*final EditText */etPassword = (EditText) findViewById(R.id.etPassword);

        final Button RegisterButton = (Button) findViewById(R.id.RegisterButton);
        final Button CancelRegisterButton = (Button) findViewById(R.id.CancelRegisterButton);


    }

    public void onCancel2Pressed(View view) {
        Intent intent = new Intent(this, WelcomeActivity.class);
        startActivity(intent);
    }
}
