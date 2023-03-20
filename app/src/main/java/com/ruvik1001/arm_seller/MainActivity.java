package com.ruvik1001.arm_seller;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;

import com.google.android.material.snackbar.Snackbar;

import java.util.Objects;


public class MainActivity extends AppCompatActivity {
    private Button btnIn;
    private Pair<String, String> login;
    private ConstraintLayout main_activity;

    private void camTest() {
        Intent intent = new Intent();
        intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(intent);
    }

    private void reaction(String msg, String react) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(msg).setPositiveButton(react, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        }).setCancelable(true);

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private Boolean log() {
        return true;
        /*
        * Base request
        * Was created some after...
        */
//        return login.first.equals(new String("John1999")) &&
//                login.second.equals(new String("Gfhjkm01"));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(this.getSupportActionBar()).hide();
        setContentView(R.layout.activity_main);

        //!!!!!!!!!!!!!!!!!!!!!!
//        this.startActivity(new Intent(MainActivity.this, SettingsActivity.class));
        //!!!!!!!!!!!!!!!!!!!!!!

        main_activity = findViewById(R.id.main_activity);
        btnIn = (Button) findViewById(R.id.login_btn);
        btnIn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        login = new Pair<>(
                                ((TextView) findViewById(R.id.login_name)).getText().toString(),
                                ((TextView) findViewById(R.id.login_pass)).getText().toString());
                        if (log()) {
                            //reaction("Successes!", "Ok");
                            //Snackbar.make(Main_menu.menu_activity, "Successful", Snackbar.LENGTH_SHORT).show();
                            Intent intent = new Intent(MainActivity.this, Main_menu.class);
                            intent.putExtra("reaction", "Successful");
                            startActivity(intent);
                            finish();
                            return;
                        }
                        else {
                            reaction("Wrong username or password!", "Ok");
                            //Snackbar.make(main_activity, "Try again", Snackbar.LENGTH_SHORT).show();
                        }
                    }
                }
        );


    }
}