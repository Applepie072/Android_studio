package com.apuli.test.example.fluid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.apuli.test.example.Example_Fluid;
import com.apuli.test.R;

public class Example_Fluid_Visual extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_fluid_visual);

        button = findViewById(R.id.example_fluid_back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_Fluid_Visual.this, Example_Fluid.class);
                startActivity(intent); //Activity 이동
            }
        });
    }
}