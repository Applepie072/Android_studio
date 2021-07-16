 package com.apuli.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.apuli.test.example.Example_Advancement;
import com.apuli.test.example.Example_Armor;
import com.apuli.test.example.Example_Block;
import com.apuli.test.example.Example_Command;
import com.apuli.test.example.Example_Creative_tab;
import com.apuli.test.example.Example_Dimension;
import com.apuli.test.example.Example_Fluid;
import com.apuli.test.example.Example_Food;
import com.apuli.test.example.Example_Fuel;
import com.apuli.test.example.Example_GUI;
import com.apuli.test.example.Example_Item;
import com.apuli.test.example.Example_Living_entity;
import com.apuli.test.example.Example_Ranged_item;
import com.apuli.test.example.Example_Structure_spawn;
import com.apuli.test.example.Example_Tool;

 public class ExampleActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);

        button = findViewById(R.id.example_advancement);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExampleActivity.this, Example_Advancement.class);
                startActivity(intent); //Activity 이동
            }
        });

        button = findViewById(R.id.example_armor);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExampleActivity.this, Example_Armor.class);
                startActivity(intent); //Activity 이동
            }
        });

        button = findViewById(R.id.example_block);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExampleActivity.this, Example_Block.class);
                startActivity(intent); //Activity 이동
            }
        });

        button = findViewById(R.id.example_command);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExampleActivity.this, Example_Command.class);
                startActivity(intent); //Activity 이동
            }
        });

        button = findViewById(R.id.example_creative_tab);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExampleActivity.this, Example_Creative_tab.class);
                startActivity(intent); //Activity 이동
            }
        });

        button = findViewById(R.id.example_dimension);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExampleActivity.this, Example_Dimension.class);
                startActivity(intent); //Activity 이동
            }
        });

        button = findViewById(R.id.example_fluid);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExampleActivity.this, Example_Fluid.class);
                startActivity(intent); //Activity 이동
            }
        });

        button = findViewById(R.id.example_food);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExampleActivity.this, Example_Food.class);
                startActivity(intent); //Activity 이동
            }
        });

        button = findViewById(R.id.example_fuel);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExampleActivity.this, Example_Fuel.class);
                startActivity(intent); //Activity 이동
            }
        });

        button = findViewById(R.id.example_item);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExampleActivity.this, Example_Item.class);
                startActivity(intent); //Activity 이동
            }
        });

        button = findViewById(R.id.example_living_entity);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExampleActivity.this, Example_Living_entity.class);
                startActivity(intent); //Activity 이동
            }
        });

        button = findViewById(R.id.example_ranged_item);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExampleActivity.this, Example_Ranged_item.class);
                startActivity(intent); //Activity 이동
            }
        });

        button = findViewById(R.id.example_tool);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExampleActivity.this, Example_Tool.class);
                startActivity(intent); //Activity 이동
            }
        });

        button = findViewById(R.id.example_structure_spawn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExampleActivity.this, Example_Structure_spawn.class);
                startActivity(intent); //Activity 이동
            }
        });

        button = findViewById(R.id.example_gui);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExampleActivity.this, Example_GUI.class);
                startActivity(intent); //Activity 이동
            }
        });

        button = findViewById(R.id.example_back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExampleActivity.this, MainActivity.class);
                startActivity(intent); //Activity 이동
            }
        });
    }
}