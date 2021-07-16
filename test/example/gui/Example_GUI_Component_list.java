package com.apuli.test.example.gui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.apuli.test.R;
import com.apuli.test.example.Example_GUI;
import com.apuli.test.example.gui.component_list.Example_GUI_Component_list_Button;
import com.apuli.test.example.gui.component_list.Example_GUI_Component_list_Image;
import com.apuli.test.example.gui.component_list.Example_GUI_Component_list_Input;
import com.apuli.test.example.gui.component_list.Example_GUI_Component_list_Output;
import com.apuli.test.example.gui.component_list.Example_GUI_Component_list_label;

public class Example_GUI_Component_list extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_gui_component_list);

        button = findViewById(R.id.example_gui_component_list_label);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_GUI_Component_list.this, Example_GUI_Component_list_label.class);
                startActivity(intent); //Activity 이동
            }
        });

        button = findViewById(R.id.example_gui_component_list_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_GUI_Component_list.this, Example_GUI_Component_list_Button.class);
                startActivity(intent); //Activity 이동
            }
        });

        button = findViewById(R.id.example_gui_component_list_image);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_GUI_Component_list.this, Example_GUI_Component_list_Image.class);
                startActivity(intent); //Activity 이동
            }
        });

        button = findViewById(R.id.example_gui_component_list_input);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_GUI_Component_list.this, Example_GUI_Component_list_Input.class);
                startActivity(intent); //Activity 이동
            }
        });

        button = findViewById(R.id.example_gui_component_list_output);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_GUI_Component_list.this, Example_GUI_Component_list_Output.class);
                startActivity(intent); //Activity 이동
            }
        });

        button = findViewById(R.id.example_gui_back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_GUI_Component_list.this, Example_GUI.class);
                startActivity(intent); //Activity 이동
            }
        });
    }
}