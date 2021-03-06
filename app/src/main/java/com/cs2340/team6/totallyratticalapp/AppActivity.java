package com.cs2340.team6.totallyratticalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


/**
 * This activity is loaded when the user successfully logs in to the application
 *
 * @author Group 6
 * @version 1.0
 * @since whenever
 *
 */

public class AppActivity extends AppCompatActivity {

    private static User currentUser;
    private TextView textView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);

        textView = (TextView) findViewById(R.id.WelcomeText);
        textView.setText("You are now inside the app, " + currentUser.getName() + ". You are a"
                        + (currentUser.getRole().equals(User.Role.USER) ? " " : "n ") +
                        currentUser.getRole().toString() + ". Welcome!");
    }

    /**
     * This method is called when the logout button in this activity is loaded,
     * and returns the user to the welcome screen
     *
     * @param v A view
     *
     */
    public void onLogoutPressed (View v) {
        Intent intent = new Intent(this, WelcomeActivity.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {

    }

    /**
     * This sets the currentUser variable in this class,
     * which represents the user that is currently logged in
     *
     * @param user The currently logged-in user
     *
     */
    public static void setCurrentUser(User user) {
        currentUser = user;
    }
}
