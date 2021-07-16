package com.apuli.test.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.apuli.test.ExampleActivity;
import com.apuli.test.R;
import com.apuli.test.example.dimension.Example_Dimension_Portal;
import com.apuli.test.example.dimension.Example_Dimension_Properties;

public class Example_Dimension extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_dimension);

        button = findViewById(R.id.example_dimension_properties);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_Dimension.this, Example_Dimension_Properties.class);
                startActivity(intent);
            }
        });

        button = findViewById(R.id.example_dimension_portal);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_Dimension.this, Example_Dimension_Portal.class);
                startActivity(intent);
            }
        });

        button = findViewById(R.id.example_back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_Dimension.this, ExampleActivity.class);
                startActivity(intent);
            }
        });
    }
}