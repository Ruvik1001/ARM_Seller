package com.ruvik1001.arm_seller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HardwareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hardware);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.hard, android.R.layout.simple_list_item_1);
        ((ListView)findViewById(R.id.lvs_hardware)).setAdapter(adapter);
    }
}