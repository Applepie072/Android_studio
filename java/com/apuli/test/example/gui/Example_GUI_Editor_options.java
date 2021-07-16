package com.apuli.test.example.gui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.apuli.test.R;

public class Example_GUI_Editor_options extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_gui_editor_options);

        button = findViewById(R.id.example_gui_back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_GUI_Editor_options.this, Example_GUI_Component_list.class);
                startActivity(intent); //Activity 이동
            }
        });
    }
}