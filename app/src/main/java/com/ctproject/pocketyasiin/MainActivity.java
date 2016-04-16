package com.ctproject.pocketyasiin;

import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.ctproject.pocketyasiin.dbase.Asmaul;

public class MainActivity extends AppCompatActivity {

    boolean doubleBackToExitPressedOnce = false;
    private Button TombolYasin,TombolTahlil,TombolAyatKursi,TombolAsmaul,TombolPengaturan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TombolYasin = (Button) findViewById(R.id.tombolYasin);
        TombolTahlil = (Button) findViewById(R.id.tombolTahlil);
        TombolAyatKursi = (Button) findViewById(R.id.tombolAyatKursi);
        TombolAsmaul = (Button) findViewById(R.id.tombolAsmaul);
        TombolPengaturan = (Button) findViewById(R.id.tombolPengaturan);

        TombolYasin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this, YasinActivity.class);
                startActivity(intent);
            }
        });

        TombolTahlil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this, TahlilActivity.class);
                startActivity(intent);
            }
        });

        TombolAyatKursi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this, KursiActivity.class);
                startActivity(intent);
            }
        });

        TombolAsmaul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this, AsmaulActivity.class);
                startActivity(intent);
            }
        });

        TombolPengaturan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this, SettingActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Tekan lagi untuk keluar!", Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }

}
