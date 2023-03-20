package com.ruvik1001.arm_seller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SkladActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sklad);

        ((TextView) findViewById(R.id.menu_bar_1)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SkladActivity.this, Main_menu.class);
                startActivity(intent);
                finish();
            }
        });

        ((TextView) findViewById(R.id.menu_bar_2)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SkladActivity.this, SkladActivity.class);
                startActivity(intent);
                finish();
            }
        });

        ((TextView) findViewById(R.id.menu_bar_3)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SkladActivity.this, PostuplenieActivity.class);
                startActivity(intent);
                finish();
            }
        });

        ((TextView) findViewById(R.id.menu_bar_4)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SkladActivity.this, MyProfileActivity.class);
                startActivity(intent);
                finish();
            }
        });

        ((TextView) findViewById(R.id.menu_bar_5)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SkladActivity.this, SettingsActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}