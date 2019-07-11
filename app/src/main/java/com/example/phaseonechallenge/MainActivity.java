package com.example.phaseonechallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button myProfile, aboutALC;
    private Intent profileIntent, aboutIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        buttonOnClick();
    }

    private void initialize() {
        myProfile = findViewById(R.id.button_profile);
        aboutALC = findViewById(R.id.button_about);
        profileIntent = new Intent(MainActivity.this, MyProfile.class);
        aboutIntent = new Intent(MainActivity.this, AboutALC.class);
    }

    private void buttonOnClick() {
        myProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(profileIntent);
            }
        });

        aboutALC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(aboutIntent);
            }
        });
    }
}
