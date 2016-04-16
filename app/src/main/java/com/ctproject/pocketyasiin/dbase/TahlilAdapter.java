package com.ctproject.pocketyasiin.dbase;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.ctproject.pocketyasiin.R;

import java.util.ArrayList;

/**
 * Created by farhan on 12/28/15.
 */
public class TahlilAdapter extends ArrayAdapter<Tahlil> {

    public ArrayList<Pengaturan> valuePengaturan;
    public TahlilAdapter(Context context, ArrayList<Tahlil> users) {
        super(context, 0, users);
    }

    final DatabaseHandler dataSource = new DatabaseHandler(this);

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Tahlil tahlil = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_tahlil_view, parent, false);
        }

        TextView tvarab = (TextView) convertView.findViewById(R.id.tvArabTahlil);
        TextView tvlatin = (TextView) convertView.findViewById(R.id.tvLatinTahlil);
        TextView tvarti = (TextView) convertView.findViewById(R.id.tvArtiTahlil);
        TextView tvno = (TextView) convertView.findViewById(R.id.tvNoIDTahlil);

        String lokasiFont = "fonts/Me_Quran.ttf";
        Typeface hurufSetting = Typeface.createFromAsset(getContext().getAssets(), lokasiFont);
        tvarab.setTypeface(hurufSetting);

        tvarab.setText(tahlil._arab);
        tvlatin.setText(tahlil._latin);
        tvarti.setText(tahlil._arti);
        tvno.setText(tahlil._id + ".");

        valuePengaturan = (ArrayList<Pengaturan>) dataSource.getAllPengaturans();
        for (Pengaturan pengaturan : valuePengaturan) {
            tvarab.setTextSize(pengaturan.getHurufArab());
            tvlatin.setTextSize(pengaturan.getHurufLatin());
            tvarti.setTextSize(pengaturan.getHurufArti());
        }

        // Return the completed view to render on screen
        return convertView;
    }
}