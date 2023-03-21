package com.ruvik1001.arm_seller;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Iterator;

import kotlin.sequences.Sequence;

public class MyProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        setContentView(R.layout.my_profile);

        ArrayAdapter<CharSequence> adapterMe = ArrayAdapter.createFromResource(this, R.array.me, android.R.layout.simple_list_item_1);
        String me = "";
        for (int i = 0; i < 3; i++)
            me += adapterMe.getItem(i) + "\n\n";

        ((ImageView)findViewById(R.id.imageView11)).setImageDrawable(getResources().getDrawable(R.drawable.img));

        TextView myInfo = findViewById(R.id.myInfo);
        myInfo.setText(me);

        ArrayAdapter<CharSequence> adapterOptions = ArrayAdapter.createFromResource(this, R.array.params, android.R.layout.simple_list_item_1);
        ((ListView)findViewById(R.id.lvMy)).setAdapter(adapterOptions);


        ((TextView) findViewById(R.id.menu_bar_1)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewActiv.init(MyProfileActivity.this,1);
            }
        });

        ((TextView) findViewById(R.id.menu_bar_2)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewActiv.init(MyProfileActivity.this,2);
            }
        });

        ((TextView) findViewById(R.id.menu_bar_3)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewActiv.init(MyProfileActivity.this,3);
            }
        });

        ((TextView) findViewById(R.id.menu_bar_4)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewActiv.init(MyProfileActivity.this,4);
            }
        });

        ((TextView) findViewById(R.id.menu_bar_5)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewActiv.init(MyProfileActivity.this,5);
            }
        });
    }
}