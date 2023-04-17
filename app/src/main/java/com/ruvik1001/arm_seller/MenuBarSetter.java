package com.ruvik1001.arm_seller;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MenuBarSetter {

    public static void activate_bar(Context current) {
        ((TextView) ((AppCompatActivity) current).findViewById(R.id.menu_bar_1)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewActiv.init(current,1);
            }
        });

        ((TextView) ((AppCompatActivity) current).findViewById(R.id.menu_bar_2)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewActiv.init(current,2);
            }
        });

        ((TextView) ((AppCompatActivity) current).findViewById(R.id.menu_bar_3)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewActiv.init(current,3);
            }
        });

        ((TextView) ((AppCompatActivity) current).findViewById(R.id.menu_bar_4)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewActiv.init(current,4);
            }
        });

        ((TextView) ((AppCompatActivity) current).findViewById(R.id.menu_bar_5)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewActiv.init(current,5);
            }
        });
    }
}
