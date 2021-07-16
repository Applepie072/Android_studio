package com.apuli.test.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.apuli.test.ExampleActivity;
import com.apuli.test.R;
import com.apuli.test.example.food.Example_Food_Properties;
import com.apuli.test.example.food.Example_Food_Visual;

public class Example_Food extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_food);

        button = findViewById(R.id.example_food_visual);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_Food.this, Example_Food_Visual.class);
                startActivity(intent); //Activity 이동
            }
        });

        button = findViewById(R.id.example_food_properties);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_Food.this, Example_Food_Properties.class);
                startActivity(intent); //Activity 이동
            }
        });

        button = findViewById(R.id.example_back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_Food.this, ExampleActivity.class);
                startActivity(intent); //Activity 이동
            }
        });
    }
}