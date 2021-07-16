package com.apuli.test.example.block;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.apuli.test.example.Example_Block;
import com.apuli.test.R;

public class Example_Block_Advanced_properties extends AppCompatActivity {

    private Button button;
    private Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_block_advanced_properties);

        uri = Uri.parse("https://minecraft.gamepedia.com/Fire#Flammable_blocks");
        button = findViewById(R.id.example_block_advanced_properties_flammability_reference);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        button = findViewById(R.id.example_block_back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Example_Block_Advanced_properties.this, Example_Block.class);
                startActivity(intent);
            }
        });
    }
}