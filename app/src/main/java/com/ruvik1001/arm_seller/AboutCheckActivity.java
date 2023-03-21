package com.ruvik1001.arm_seller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class AboutCheckActivity extends AppCompatActivity {

    private String[] spin = {
            "Акт приёмки", "Акт продажи", "Акт возврата"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(R.layout.about_check);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.spinner_item, spin);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spinner = (Spinner) findViewById(R.id.spinner2);
        spinner.setAdapter(adapter);

        ((TextView)findViewById(R.id.date_doc)).setText("Дата: " + new SimpleDateFormat("HH:mm dd.MM.yy").format(new Date()));
        ((TextView)findViewById(R.id.FIO_doc)).setText("ФИО заявителя: ");
        ((TextView)findViewById(R.id.FIO_doc2)).setText("ФИО исполнителя: ");
    }
}