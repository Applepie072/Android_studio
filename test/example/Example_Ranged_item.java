package com.apuli.test.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.apuli.test.ExampleActivity;
import com.apuli.test.R;
import com.apuli.test.example.ranged_item.Example_Ranged_item_Bullet;
import com.apuli.test.example.ranged_item.Example_Ranged_item_Ranged_item;

public class Example_Ranged_item extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_ranged_item);

        button = findViewById(R.id.example_ranged_item_ranged_item);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_Ranged_item.this, Example_Ranged_item_Ranged_item.class);
                startActivity(intent); //Activity 이동
            }
        });

        button = findViewById(R.id.example_ranged_item_bullet);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_Ranged_item.this, Example_Ranged_item_Bullet.class);
                startActivity(intent); //Activity 이동
            }
        });

        button = findViewById(R.id.example_back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_Ranged_item.this, ExampleActivity.class);
                startActivity(intent); //Activity 이동
            }
        });
    }
}