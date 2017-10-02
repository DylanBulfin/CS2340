package com.cs2340.team6.totallyratticalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by dylan on 25/09/2017.
 */

public class AppActivity extends AppCompatActivity {
    private static User currentUser;
    TextView textView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);

        textView = (TextView) findViewById(R.id.WelcomeText);
        textView.setText("You are now inside the app, " + currentUser.getName() + ". You are a"
                        + (currentUser.getRole().equals(User.Role.USER) ? " " : "n ") +
                        currentUser.getRole().toString() + ". Welcome!");
    }

    public void onLogoutPressed (View v) {
        Intent intent = new Intent(this, WelcomeActivity.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {

    }

    public static void setCurrentUser(User user) {
        currentUser = user;
    }
}
