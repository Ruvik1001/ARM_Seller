package com.ruvik1001.arm_seller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

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


        MenuBarSetter.activate_bar(this);
    }
}