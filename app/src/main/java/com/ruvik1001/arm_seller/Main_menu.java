package com.ruvik1001.arm_seller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

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

        MenuBarSetter.activate_bar(this);

        findViewById(R.id.kvitan).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewActiv.Click(Main_menu.this, AboutCheckActivity.class);
            }
        });

        findViewById(R.id.find).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewActiv.Click(Main_menu.this, SerchActivity.class);
            }
        });

        findViewById(R.id.brack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewActiv.Click(Main_menu.this, ReportAboutDefectActivity.class);
            }
        });

        findViewById(R.id.smena).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewActiv.Click(Main_menu.this, MyChangeActivity.class);
            }
        });

        findViewById(R.id.quit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewActiv.Click(Main_menu.this, MainActivity.class, true);
            }
        });
    }
}