package com.example.androiduitesting;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        Intent intent = getIntent();
        String cityName = intent.getStringExtra("city_name");

        // Set city name in header
        TextView cityNameText = findViewById(R.id.city_name_text);
        cityNameText.setText(cityName);

        // Set city name in info card
        TextView cardCityName = findViewById(R.id.card_city_name);
        cardCityName.setText(cityName);

        // Back button
        Button backButton = findViewById(R.id.button_back);
        backButton.setOnClickListener(v -> finish());
    }
}