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
 * Created by farhan on 12/25/15.
 */
public class YasinAdapter extends ArrayAdapter<Yasin> {

    public YasinAdapter(Context context, ArrayList<Yasin> users) {
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Yasin yasin = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_yasin_view, parent, false);
        }

        String getNomor = Integer.toString(yasin.getID());
        // Lookup view for data population
        TextView tvarab = (TextView) convertView.findViewById(R.id.tvArab);
        TextView tvlatin = (TextView) convertView.findViewById(R.id.tvLatin);
        TextView tvarti = (TextView) convertView.findViewById(R.id.tvArti);
        TextView tvno = (TextView) convertView.findViewById(R.id.tvNoID);

        String lokasiFont = "fonts/Me_Quran.ttf";
        Typeface hurufSetting = Typeface.createFromAsset(getContext().getAssets(), lokasiFont);
        tvarab.setTypeface(hurufSetting);

        tvarab.setText(yasin._arab);
        tvlatin.setText(yasin._latin);
        tvarti.setText(yasin._arti);
        tvno.setText(yasin._id + ".");

        // Return the completed view to render on screen

        return convertView;
    }
}