package com.ruvik1001.arm_seller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TableRow;
import android.widget.TextView;

public class SkladActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sklad);

        ((TextView) findViewById(R.id.menu_bar_1)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewActiv.init(SkladActivity.this,1);
            }
        });

        ((TextView) findViewById(R.id.menu_bar_2)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewActiv.init(SkladActivity.this,2);
            }
        });

        ((TextView) findViewById(R.id.menu_bar_3)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewActiv.init(SkladActivity.this,3);
            }
        });

        ((TextView) findViewById(R.id.menu_bar_4)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewActiv.init(SkladActivity.this,4);
            }
        });

        ((TextView) findViewById(R.id.menu_bar_5)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewActiv.init(SkladActivity.this,5);
            }
        });

        ((TableRow) findViewById(R.id.instr_btn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewActiv.Click(SkladActivity.this,InstrumentyActivity.class);
            }
        });

        ((TableRow) findViewById(R.id.kraski_btn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewActiv.Click(SkladActivity.this,KraskiActivity.class);
            }
        });

        ((TableRow) findViewById(R.id.napol_btn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewActiv.Click(SkladActivity.this,NapolniyActivity.class);
            }
        });

        ((TableRow) findViewById(R.id.plitk_btn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewActiv.Click(SkladActivity.this,PlitkaActivity.class);
            }
        });

        ((TableRow) findViewById(R.id.skoby_btn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewActiv.Click(SkladActivity.this,HardwareActivity.class);
            }
        });

        ((TableRow) findViewById(R.id.pilo_btn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewActiv.Click(SkladActivity.this,PiloMaterialActivity.class);
            }
        });

        ((TableRow) findViewById(R.id.stroy_btn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewActiv.Click(SkladActivity.this,StroyMaterialActivity.class);
            }
        });
    }
}