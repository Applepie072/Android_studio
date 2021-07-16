package com.apuli.test.example.block;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.apuli.test.example.Example_Block;
import com.apuli.test.R;

public class Example_Block_Properties extends AppCompatActivity {

    private Button button;
    private Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_block_properties);

        uri = Uri.parse("https://mcreator.net/wiki/materials");
        button = findViewById(R.id.example_block_properties_material_reference);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        uri = Uri.parse("https://mcreator.net/wiki/how-make-loot-table");
        button = findViewById(R.id.example_block_properties_loot_table_reference);
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
                Intent intent = new Intent(Example_Block_Properties.this, Example_Block.class);
                startActivity(intent);
            }
        });
    }
}