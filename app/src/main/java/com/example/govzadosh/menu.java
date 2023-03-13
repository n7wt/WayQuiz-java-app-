package com.example.govzadosh;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;

import android.os.Bundle;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button start = findViewById(R.id.Start);
        Button rating = findViewById(R.id.Rating);
        Button setting = findViewById(R.id.Settings);
    }
}