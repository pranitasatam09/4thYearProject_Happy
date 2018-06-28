package com.kevinmaher.x14328981.happy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("myTag","DEBUG");
        Log.e("myTag","ERROR");
        Log.i("myTag","INFO");
        Log.v("myTag","VERBOSE");
        Log.e("myTag","WARN");

        Button btnMainLogin = (Button)findViewById(R.id.btn_help_websites);
        Button btnMainRegister = (Button)findViewById(R.id.btn_home_map);
        Button btnSettings = (Button)findViewById(R.id.btn_main_settings);
        Button btnNav = (Button)findViewById(R.id.btn_main_nav);

        btnMainLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });

        btnMainRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, RegisterActivity.class));
            }
        });

        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SettingsActivity.class));
            }
        });

        btnNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, NavActivity.class));
            }
        });
    }
}