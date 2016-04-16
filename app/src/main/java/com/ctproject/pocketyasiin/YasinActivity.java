package com.ctproject.pocketyasiin;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.ctproject.pocketyasiin.dbase.DatabaseHandler;
import com.ctproject.pocketyasiin.dbase.Yasin;
import com.ctproject.pocketyasiin.dbase.YasinAdapter;

import java.util.ArrayList;

/**
 * Created by farhan on 12/24/15.
 */
public class YasinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yasin);

        final TextView Bismillah = (TextView) findViewById(R.id.bismillah);
        final ListView lv = (ListView) findViewById(R.id.listview);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.soundyasin);
        final Button pause = (Button) findViewById(R.id.pause);
        final Button putar = (Button) findViewById(R.id.putar);
        final ArrayList<Yasin> values;
        final DatabaseHandler dataSource = new DatabaseHandler(this);
        values = (ArrayList<Yasin>) dataSource.getAllYasins();


        pause.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                mp.pause();
            }
        });

        putar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if (mp.isPlaying() == true) {
                    mp.pause();
                }
                else{mp.start();}
            }
        });

        String lokasiFont = "fonts/Me_Quran.ttf";
        Typeface hurufSetting = Typeface.createFromAsset(getAssets(), lokasiFont);
        Bismillah.setTypeface(hurufSetting);
        Bismillah.setText("بِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ");

        YasinAdapter adapter = new YasinAdapter(this, values);
        lv.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        final LinearLayout Kontrol = (LinearLayout) findViewById(R.id.kontrol);

        switch (item.getItemId()) {
            case R.id.action_audio:
                Kontrol.setVisibility(View.VISIBLE);
                return true;
            case R.id.action_settings:
                // Green item was selected
                Intent intent = new Intent(YasinActivity.this, SettingActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

