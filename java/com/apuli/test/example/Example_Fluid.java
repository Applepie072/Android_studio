package com.apuli.test.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.apuli.test.ExampleActivity;
import com.apuli.test.R;
import com.apuli.test.example.fluid.Example_Fluid_Generation;
import com.apuli.test.example.fluid.Example_Fluid_Properties;
import com.apuli.test.example.fluid.Example_Fluid_Visual;

public class Example_Fluid extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_fluid);

        button = findViewById(R.id.example_fluid_visual);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_Fluid.this, Example_Fluid_Visual.class);
                startActivity(intent); //Activity 이동
            }
        });

        button = findViewById(R.id.example_fluid_properties);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_Fluid.this, Example_Fluid_Properties.class);
                startActivity(intent); //Activity 이동
            }
        });

        button = findViewById(R.id.example_fluid_generation);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_Fluid.this, Example_Fluid_Generation.class);
                startActivity(intent); //Activity 이동
            }
        });

        button = findViewById(R.id.example_back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_Fluid.this, ExampleActivity.class);
                startActivity(intent); //Activity 이동
            }
        });
    }
}