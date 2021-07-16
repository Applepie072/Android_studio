package com.apuli.test.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.apuli.test.ExampleActivity;
import com.apuli.test.example.gui.Example_GUI_Component_list;
import com.apuli.test.R;
import com.apuli.test.example.gui.Example_GUI_Editor_options;
import com.apuli.test.example.gui.Example_GUI_Properties;

public class Example_GUI extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_gui);

        button = findViewById(R.id.example_gui_properties);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_GUI.this, Example_GUI_Properties.class);
                startActivity(intent); //Activity 이동
            }
        });

        button = findViewById(R.id.example_gui_editor_options);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_GUI.this, Example_GUI_Editor_options.class);
                startActivity(intent); //Activity 이동
            }
        });

        button = findViewById(R.id.example_gui_component_list);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_GUI.this, Example_GUI_Component_list.class);
                startActivity(intent); //Activity 이동
            }
        });

        button = findViewById(R.id.example_back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_GUI.this, ExampleActivity.class);
                startActivity(intent); //Activity 이동
            }
        });
    }
}