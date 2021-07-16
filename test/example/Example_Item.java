package com.apuli.test.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.apuli.test.ExampleActivity;
import com.apuli.test.R;
import com.apuli.test.example.item.Example_Item_Inventory;
import com.apuli.test.example.item.Example_Item_Properties;
import com.apuli.test.example.item.Example_Item_Visual;

public class Example_Item extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_item);

        button = findViewById(R.id.example_item_visual);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_Item.this, Example_Item_Visual.class);
                startActivity(intent); //Activity 이동
            }
        });

        button = findViewById(R.id.example_item_properties);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_Item.this, Example_Item_Properties.class);
                startActivity(intent); //Activity 이동
            }
        });

        button = findViewById(R.id.example_item_inventory);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_Item.this, Example_Item_Inventory.class);
                startActivity(intent); //Activity 이동
            }
        });

        button = findViewById(R.id.example_back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_Item.this, ExampleActivity.class);
                startActivity(intent); //Activity 이동
            }
        });
    }
}