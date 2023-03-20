package com.ruvik1001.arm_seller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class PostuplenieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.postuplenie);

        ListView lv = (ListView) findViewById(R.id.lv);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.post, android.R.layout.simple_list_item_1);
        lv.setAdapter(adapter);

        ((TextView) findViewById(R.id.menu_bar_1)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PostuplenieActivity.this, Main_menu.class);
                startActivity(intent);
                finish();
            }
        });

        ((TextView) findViewById(R.id.menu_bar_2)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PostuplenieActivity.this, SkladActivity.class);
                startActivity(intent);
                finish();
            }
        });

        ((TextView) findViewById(R.id.menu_bar_3)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PostuplenieActivity.this, PostuplenieActivity.class);
                startActivity(intent);
                finish();
            }
        });

        ((TextView) findViewById(R.id.menu_bar_4)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PostuplenieActivity.this, MyProfileActivity.class);
                startActivity(intent);
                finish();
            }
        });

        ((TextView) findViewById(R.id.menu_bar_5)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PostuplenieActivity.this, SettingsActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}