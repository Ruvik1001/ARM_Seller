package com.ruvik1001.arm_seller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        ListView lv = (ListView) findViewById(R.id.sett);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.settings, android.R.layout.simple_list_item_1);
        lv.setAdapter(adapter);

        MenuBarSetter.activate_bar(this);
    }
}