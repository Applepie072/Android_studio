package com.apuli.test.example.tool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.apuli.test.example.Example_Tool;
import com.apuli.test.R;

public class Example_Tool_Visual extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_tool_visual);

        button = findViewById(R.id.example_tool_back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_Tool_Visual.this, Example_Tool.class);
                startActivity(intent);
            }
        });
    }
}