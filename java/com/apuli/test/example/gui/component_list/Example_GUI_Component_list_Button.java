package com.apuli.test.example.gui.component_list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.apuli.test.example.gui.Example_GUI_Component_list;
import com.apuli.test.R;

public class Example_GUI_Component_list_Button extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_gui_component_list_button);

        button = findViewById(R.id.example_gui_component_list_back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_GUI_Component_list_Button.this, Example_GUI_Component_list.class);
                startActivity(intent); //Activity 이동
            }
        });
    }
}