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
public class AsmaulAdapter extends ArrayAdapter<Asmaul> {

    public AsmaulAdapter(Context context, ArrayList<Asmaul> users) {
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Asmaul asmaul = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_asmaul_view, parent, false);
        }

        TextView tvarab = (TextView) convertView.findViewById(R.id.tvArabAsmaul);
        TextView tvlatin = (TextView) convertView.findViewById(R.id.tvLatinAsmaul);
        TextView tvarti = (TextView) convertView.findViewById(R.id.tvArtiAsmaul);
        TextView tvno = (TextView) convertView.findViewById(R.id.tvNoIDAsmaul);

        String lokasiFont = "fonts/Me_Quran.ttf";
        Typeface hurufSetting = Typeface.createFromAsset(getContext().getAssets(), lokasiFont);
        tvarab.setTypeface(hurufSetting);

        tvarab.setText(asmaul._arab);
        tvlatin.setText(asmaul._latin);
        tvarti.setText(asmaul._arti);
        tvno.setText(asmaul._id + ".");

        // Return the completed view to render on screen

        return convertView;
    }
}