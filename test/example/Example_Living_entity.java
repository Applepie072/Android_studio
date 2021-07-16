package com.apuli.test.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.apuli.test.ExampleActivity;
import com.apuli.test.R;
import com.apuli.test.example.living_entity.Example_Living_entity_Behaviour;
import com.apuli.test.example.living_entity.Example_Living_entity_Inventory;
import com.apuli.test.example.living_entity.Example_Living_entity_Particles;
import com.apuli.test.example.living_entity.Example_Living_entity_Spawning;
import com.apuli.test.example.living_entity.Example_Living_entity_Visual_and_Sound;

public class Example_Living_entity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_living_entity);

        button = findViewById(R.id.example_living_entity_visual_and_sound);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_Living_entity.this, Example_Living_entity_Visual_and_Sound.class);
                startActivity(intent); //Activity 이동
            }
        });

        button = findViewById(R.id.example_living_entity_behaviour);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_Living_entity.this, Example_Living_entity_Behaviour.class);
                startActivity(intent); //Activity 이동
            }
        });

        button = findViewById(R.id.example_living_entity_particles);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_Living_entity.this, Example_Living_entity_Particles.class);
                startActivity(intent); //Activity 이동
            }
        });

        button = findViewById(R.id.example_living_entity_inventory);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_Living_entity.this, Example_Living_entity_Inventory.class);
                startActivity(intent); //Activity 이동
            }
        });

        button = findViewById(R.id.example_living_entity_spawning);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_Living_entity.this, Example_Living_entity_Spawning.class);
                startActivity(intent); //Activity 이동
            }
        });

        button = findViewById(R.id.example_back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_Living_entity.this, ExampleActivity.class);
                startActivity(intent); //Activity 이동
            }
        });
    }
}