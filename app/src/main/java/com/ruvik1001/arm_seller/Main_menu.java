package com.ruvik1001.arm_seller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

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
//        loadMenu();
    }

//    private void loadMenu() {
//        ListView list = findViewById(R.id.menu_material);
//        AdapterView<Atom> adapter = new AdapterView<Atom>() {
//            @Override
//            public Atom getAdapter() {
//                return null;
//            }
//
//            @Override
//            public void setAdapter(Atom atom) {
//
//            }
//
//            @Override
//            public View getSelectedView() {
//                return this;
//            }
//
//            @Override
//            public void setSelection(int i) {
//
//            }
//        }
//    }


}