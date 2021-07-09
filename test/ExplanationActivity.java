package com.apuli.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExplanationActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explanation);

        button = findViewById(R.id.explanation_back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExplanationActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        button = findViewById(R.id.explanation_example);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExplanationActivity.this, ExampleActivity.class);
                startActivity(intent);
            }
        });

        button = findViewById(R.id.explanation_movie);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExplanationActivity.this, MovieActivity.class);
                startActivity(intent);
            }
        });
    }
}