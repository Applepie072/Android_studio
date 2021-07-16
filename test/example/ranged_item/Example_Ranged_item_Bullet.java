package com.apuli.test.example.ranged_item;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.apuli.test.example.Example_Ranged_item;
import com.apuli.test.R;

public class Example_Ranged_item_Bullet extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_ranged_item_bullet);

        button = findViewById(R.id.example_ranged_item_back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_Ranged_item_Bullet.this, Example_Ranged_item.class);
                startActivity(intent);
            }
        });
    }
}