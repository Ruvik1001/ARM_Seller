package com.ruvik1001.arm_seller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TableRow;

public class SkladActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sklad);

        MenuBarSetter.activate_bar(this);

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