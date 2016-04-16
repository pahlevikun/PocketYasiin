package com.ctproject.pocketyasiin.setting;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.ctproject.pocketyasiin.R;

/**
 * Created by farhan on 12/24/15.
 */
public class BantuanActivity extends AppCompatActivity {

    private TextView txtPenggunaan_p1, txtPenggunaan_t1, txtPenggunaan_t2, txtPenggunaan_t3, txtPenggunaan_t4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_bantuan);

        /*String lokasiFont = "fonts/Gabriola.ttf";
        txtPenggunaan_p1 = (TextView) findViewById(R.id.penggunaan_p1);
        txtPenggunaan_t1 = (TextView) findViewById(R.id.penggunaan_t1);
        txtPenggunaan_t2 = (TextView) findViewById(R.id.penggunaan_t2);
        txtPenggunaan_t3 = (TextView) findViewById(R.id.penggunaan_t3);
        txtPenggunaan_t4 = (TextView) findViewById(R.id.penggunaan_t4);

        Typeface hurufSetting = Typeface.createFromAsset(getAssets(),lokasiFont);
        txtPenggunaan_p1.setTypeface(hurufSetting);
        txtPenggunaan_t1.setTypeface(hurufSetting);
        txtPenggunaan_t2.setTypeface(hurufSetting);
        txtPenggunaan_t3.setTypeface(hurufSetting);
        txtPenggunaan_t4.setTypeface(hurufSetting);*/
    }
}
