package com.apuli.test.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.apuli.test.ExampleActivity;
import com.apuli.test.R;

public class Example_Fuel extends AppCompatActivity {

    private Button button;
    private Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_fuel);

        uri = Uri.parse("https://mcreator.net/wiki/burn-time-fuels");
        button = findViewById(R.id.example_fuel_burn_time_reference);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            }
        });

        button = findViewById(R.id.example_back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_Fuel.this, ExampleActivity.class);
                startActivity(intent); //Activity 이동
            }
        });
    }
}