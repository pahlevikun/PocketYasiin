package com.ctproject.pocketyasiin;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import com.ctproject.pocketyasiin.dbase.Asmaul;
import com.ctproject.pocketyasiin.dbase.AsmaulAdapter;
import com.ctproject.pocketyasiin.dbase.DatabaseHandler;

import java.util.ArrayList;

/**
 * Created by farhan on 12/28/15.
 */
public class AsmaulActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asmaul);

        final TextView Bismillah = (TextView) findViewById(R.id.bismillahAsmaul);
        final ListView lv = (ListView) findViewById(R.id.listviewAsmaul);
        final ArrayList<Asmaul> values;
        final DatabaseHandler dataSource = new DatabaseHandler(this);
        values = (ArrayList<Asmaul>) dataSource.getAllAsmauls();

        String lokasiFont = "fonts/Me_Quran.ttf";
        Typeface hurufSetting = Typeface.createFromAsset(getAssets(), lokasiFont);
        Bismillah.setTypeface(hurufSetting);
        Bismillah.setText("بِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ");

        AsmaulAdapter adapter = new AsmaulAdapter(this, values);
        lv.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_sub, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_settings:
                // Green item was selected
                Intent intent = new Intent(AsmaulActivity.this, SettingActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}