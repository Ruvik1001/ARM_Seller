package com.ruvik1001.arm_seller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        ListView lv = (ListView) findViewById(R.id.sett);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.settings, android.R.layout.simple_list_item_1);
        lv.setAdapter(adapter);

        ((TextView) findViewById(R.id.menu_bar_1)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewActiv.init(SettingsActivity.this,1);
            }
        });

        ((TextView) findViewById(R.id.menu_bar_2)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewActiv.init(SettingsActivity.this,2);
            }
        });

        ((TextView) findViewById(R.id.menu_bar_3)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewActiv.init(SettingsActivity.this,3);
            }
        });

        ((TextView) findViewById(R.id.menu_bar_4)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewActiv.init(SettingsActivity.this,4);
            }
        });

        ((TextView) findViewById(R.id.menu_bar_5)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewActiv.init(SettingsActivity.this,5);
            }
        });
    }
}