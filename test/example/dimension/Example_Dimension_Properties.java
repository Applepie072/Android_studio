package com.apuli.test.example.dimension;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.apuli.test.example.Example_Dimension;
import com.apuli.test.R;

public class Example_Dimension_Properties extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_dimension_properties);

        button = findViewById(R.id.example_dimension_back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_Dimension_Properties.this, Example_Dimension.class);
                startActivity(intent);
            }
        });
    }
}