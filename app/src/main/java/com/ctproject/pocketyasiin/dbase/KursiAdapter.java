package com.ctproject.pocketyasiin.dbase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
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
public class KursiAdapter extends ArrayAdapter<Kursi> {

    public KursiAdapter(Context context, ArrayList<Kursi> users) {
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Kursi kursi = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_kursi_view, parent, false);
        }

        TextView tvarab = (TextView) convertView.findViewById(R.id.tvArabKursi);
        TextView tvlatin = (TextView) convertView.findViewById(R.id.tvLatinKursi);
        TextView tvarti = (TextView) convertView.findViewById(R.id.tvArtiKursi);
        TextView tvno = (TextView) convertView.findViewById(R.id.tvNoIDKursi);

        String lokasiFont = "fonts/Me_Quran.ttf";
        Typeface hurufSetting = Typeface.createFromAsset(getContext().getAssets(), lokasiFont);
        tvarab.setTypeface(hurufSetting);

        tvarab.setText(kursi._arab);
        tvlatin.setText(kursi._latin);
        tvarti.setText(kursi._arti);
        tvno.setText(kursi._id + ".");

        // Return the completed view to render on screen

        return convertView;
    }
}