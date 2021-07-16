package com.apuli.test.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.apuli.test.ExampleActivity;
import com.apuli.test.R;
import com.apuli.test.example.block.Example_Block_Advanced_properties;
import com.apuli.test.example.block.Example_Block_Energy_fluid_storage;
import com.apuli.test.example.block.Example_Block_Generation;
import com.apuli.test.example.block.Example_Block_Properties;
import com.apuli.test.example.block.Example_Block_Tile_entity;
import com.apuli.test.example.block.Example_Block_Visual;

public class Example_Block extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_block);

        button = findViewById(R.id.example_block_visual);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_Block.this, Example_Block_Visual.class);
                startActivity(intent);
            }
        });

        button = findViewById(R.id.example_block_properties);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_Block.this, Example_Block_Properties.class);
                startActivity(intent);
            }
        });

        button = findViewById(R.id.example_block_advanced_properties);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_Block.this, Example_Block_Advanced_properties.class);
                startActivity(intent);
            }
        });

        button = findViewById(R.id.example_block_tile_entity);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_Block.this, Example_Block_Tile_entity.class);
                startActivity(intent);
            }
        });

        button = findViewById(R.id.example_block_energy_fluid_storage);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_Block.this, Example_Block_Energy_fluid_storage.class);
                startActivity(intent);
            }
        });

        button = findViewById(R.id.example_block_generation);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_Block.this, Example_Block_Generation.class);
                startActivity(intent);
            }
        });

        button = findViewById(R.id.example_back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_Block.this, ExampleActivity.class);
                startActivity(intent);
            }
        });
    }
}