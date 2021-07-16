package com.apuli.test.example.living_entity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.apuli.test.example.Example_Living_entity;
import com.apuli.test.R;

public class Example_Living_entity_Particles extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_living_entity_particles);

        button = findViewById(R.id.example_living_entity_back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_Living_entity_Particles.this, Example_Living_entity.class);
                startActivity(intent); //Activity 이동
            }
        });
    }
}