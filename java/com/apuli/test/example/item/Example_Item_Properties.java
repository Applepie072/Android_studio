package com.apuli.test.example.item;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.apuli.test.example.Example_Item;
import com.apuli.test.R;

public class Example_Item_Properties extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_item_properties);

        button = findViewById(R.id.example_item_back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_Item_Properties.this, Example_Item.class);
                startActivity(intent); //Activity 이동
            }
        });
    }
}