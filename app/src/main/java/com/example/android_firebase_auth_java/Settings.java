package com.example.android_firebase_auth_java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.button.MaterialButtonToggleGroup;

public class Settings extends AppCompatActivity {
    MaterialButtonToggleGroup buttonThemeToggler;
    Button buttonGoBack;
    Button buttonChangeLanguage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        buttonThemeToggler = findViewById(R.id.buttonThemeToggler);
        buttonGoBack = findViewById(R.id.buttonGoBack);
        buttonChangeLanguage = findViewById(R.id.buttonChangeLanguage);

        buttonThemeToggler.addOnButtonCheckedListener((group, selectedButtonId, isChecked) -> {
            if(isChecked && selectedButtonId == R.id.buttonLightTheme ) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                Toast.makeText(Settings.this, "Changed theme to Light", Toast.LENGTH_SHORT).show();
            } else if(isChecked && selectedButtonId == R.id.buttonDarkTheme) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                Toast.makeText(Settings.this, "Changed theme to Dark", Toast.LENGTH_SHORT).show();
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM);
                Toast.makeText(Settings.this, "Changed theme to System", Toast.LENGTH_SHORT).show();
            }
        });

        buttonGoBack.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
            finish();
        });

        /*buttonChangeLanguage.setOnClickListener(view -> {
            Intent intent = new Intent(Settings.);
            startActivity(intent);
        });*/
    }

}