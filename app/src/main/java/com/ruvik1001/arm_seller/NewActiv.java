package com.ruvik1001.arm_seller;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class NewActiv {

    public static void init(Context current, int nextActivity, Boolean... destroy) {
        Boolean de = true;
        if (destroy.length != 0)
            de = destroy[0];

        switch (nextActivity) {
            case 1:
                Click(current, Main_menu.class, de);
                break;

            case 2:
                Click(current, SkladActivity.class, de);
                break;

            case 3:
                Click(current, PostuplenieActivity.class, de);
                break;

            case 4:
                Click(current, MyProfileActivity.class, de);
                break;

            case 5:
                Click(current, SettingsActivity.class, de);
                break;


        }
    }

    public static void Click(Context current, Class<?> nextActivity, Boolean... destroy) {
        Intent intent = new Intent(current, nextActivity);
        current.startActivity(intent);
        if (destroy.length > 0 && destroy[0])
            ((AppCompatActivity)(current)).finish();
    }
}
