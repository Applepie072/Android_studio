package com.apuli.test.example.block;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.apuli.test.example.Example_Block;
import com.apuli.test.R;

public class Example_Block_Visual extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_block_visual);

        button = findViewById(R.id.example_block_back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_Block_Visual.this, Example_Block.class);
                startActivity(intent);
            }
        });
    }
}