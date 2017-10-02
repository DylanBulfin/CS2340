package com.cs2340.team6.totallyratticalapp;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {

    EditText etPassword;
    EditText etUsername;
    private static ArrayList<User> users = new ArrayList<User>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);

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
        if (LoginActivity.userExists(etUsername.getText().toString(), etPassword.getText().toString())) {
            AppActivity.setCurrentUser(findUser(etUsername.getText().toString()));
            Intent intent = new Intent(this, AppActivity.class);
            startActivity(intent);
        }
        else {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("I ain't know you. \r\nWrong Username or Password.");
            AlertDialog dialogue = builder.create();
            dialogue.show();
        }
    }

    @Override
    public void onBackPressed() {

    }

    public static void addUser (User user) {
        users.add(user);
    }

    public static boolean userExists (String username, String password) {
        for (User u : users) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public static boolean usernameAvailable(String username) {
        for (User u : users) {
            if (u.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<User> getUsers() {
        return users;
    }

    private User findUser (String username) {
        for (User u : users) {
            if (u.getUsername().equals(username)) {
                return u;
            }
        }
        return null;
    }
}
