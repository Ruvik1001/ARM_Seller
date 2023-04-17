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

        MenuBbarSetter.activate_bar(this);
    }
}