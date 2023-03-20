package com.ruvik1001.arm_seller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import java.util.LinkedList;
import java.util.List;

public class Main_menu extends AppCompatActivity {
    public static ConstraintLayout menu_activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        menu_activity = findViewById(R.id.main_menu);
        if (getIntent().getStringExtra("reaction") != null) {
            Snackbar.make(Main_menu.menu_activity, getIntent().getStringExtra("reaction"), Snackbar.LENGTH_SHORT).show();
        }

        ((TextView) findViewById(R.id.menu_bar_1)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main_menu.this, Main_menu.class);
                startActivity(intent);
                finish();
            }
        });

        ((TextView) findViewById(R.id.menu_bar_2)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main_menu.this, SkladActivity.class);
                startActivity(intent);
                finish();
            }
        });

        ((TextView) findViewById(R.id.menu_bar_3)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main_menu.this, PostuplenieActivity.class);
                startActivity(intent);
                finish();
            }
        });

        ((TextView) findViewById(R.id.menu_bar_4)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main_menu.this, MyProfileActivity.class);
                startActivity(intent);
                finish();
            }
        });

        ((TextView) findViewById(R.id.menu_bar_5)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main_menu.this, SettingsActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}