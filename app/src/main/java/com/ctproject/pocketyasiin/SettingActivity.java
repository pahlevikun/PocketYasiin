package com.ctproject.pocketyasiin;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ctproject.pocketyasiin.setting.BantuanActivity;
import com.ctproject.pocketyasiin.setting.TentangAplikasiActivity;
import com.ctproject.pocketyasiin.setting.TentangKamiActivity;

import org.w3c.dom.Text;

/**
 * Created by farhan on 12/24/15.
 */
public class SettingActivity extends AppCompatActivity implements View.OnClickListener {

    public LinearLayout TentangAplikasi, Bantuan, BeriRating, Bagikan, Saran, TentangKami, HurufArab, HurufLatin, HurufArti;
    public CheckBox LayarNyala, LayarPenuh;

    public TextView nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        nama = (TextView) findViewById(R.id.tvNoID);

        LayarNyala = (CheckBox) findViewById(R.id.checkLayar);
        LayarPenuh = (CheckBox) findViewById(R.id.checkPenuh);
        HurufArab = (LinearLayout) findViewById(R.id.hurufArab);
        HurufLatin = (LinearLayout) findViewById(R.id.hurufLatin);
        HurufArti = (LinearLayout) findViewById(R.id.hurufArti);
        TentangAplikasi = (LinearLayout) findViewById(R.id.tentang_aplikasi);
        Bantuan = (LinearLayout) findViewById(R.id.bantuan);
        BeriRating = (LinearLayout) findViewById(R.id.beri_rating);
        Bagikan = (LinearLayout) findViewById(R.id.bagikan);
        Saran = (LinearLayout) findViewById(R.id.kritik_saran);
        TentangKami = (LinearLayout) findViewById(R.id.tentang);

        nama.setOnClickListener(SettingActivity.this);

        TentangAplikasi.setOnClickListener(this);
        Bantuan.setOnClickListener(this);
        BeriRating.setOnClickListener(this);
        Bagikan.setOnClickListener(this);
        Saran.setOnClickListener(this);
        TentangKami.setOnClickListener(this);
        LayarNyala.setOnClickListener(this);
        LayarPenuh.setOnClickListener(this);
        HurufArab.setOnClickListener(this);
        HurufLatin.setOnClickListener(this);
        HurufArti.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.checkLayar:
                AlertDialog.Builder nyala = new AlertDialog.Builder(this);
                nyala
                        .setTitle("Pemberitahuan")
                        .setMessage("Mohon maaf, fitur ini belum terimplementasi. Mohon tunggu update selanjutnya. Terimakasih.")
                        .setPositiveButton("Ya", null)
                        .show();
                LayarNyala.setChecked(false);
                break;
            case R.id.checkPenuh:
                AlertDialog.Builder penuh = new AlertDialog.Builder(this);
                penuh
                        .setTitle("Pemberitahuan")
                        .setMessage("Mohon maaf, fitur ini belum terimplementasi. Mohon tunggu update selanjutnya. Terimakasih.")
                        .setPositiveButton("Ya", null)
                        .show();
                LayarPenuh.setChecked(false);
                break;
            case R.id.hurufArab:
                AlertDialog.Builder arab = new AlertDialog.Builder(this);
                arab
                        .setTitle("Pemberitahuan")
                        .setMessage("Mohon maaf, fitur ini belum terimplementasi. Mohon tunggu update selanjutnya. Terimakasih.")
                        .setPositiveButton("Ya", null)
                        .show();
                LayarPenuh.setChecked(false);
                break;
            case R.id.hurufLatin:
                AlertDialog.Builder latin = new AlertDialog.Builder(this);
                latin
                        .setTitle("Pemberitahuan")
                        .setMessage("Mohon maaf, fitur ini belum terimplementasi. Mohon tunggu update selanjutnya. Terimakasih.")
                        .setPositiveButton("Ya", null)
                        .show();
                LayarPenuh.setChecked(false);
                break;
            case R.id.hurufArti:
                AlertDialog.Builder arti = new AlertDialog.Builder(this);
                arti
                        .setTitle("Pemberitahuan")
                        .setMessage("Mohon maaf, fitur ini belum terimplementasi. Mohon tunggu update selanjutnya. Terimakasih.")
                        .setPositiveButton("Ya", null)
                        .show();
                LayarPenuh.setChecked(false);
                break;
            case R.id.tentang_aplikasi:
                Intent intentAplikasi = new Intent(SettingActivity.this, TentangAplikasiActivity.class);
                startActivity(intentAplikasi);
                break;
            case R.id.bantuan:
                Intent intentBantuan = new Intent(SettingActivity.this, BantuanActivity.class);
                startActivity(intentBantuan);
                break;
            case R.id.beri_rating:
                AlertDialog.Builder rating = new AlertDialog.Builder(this);
                rating
                        .setTitle("Pemberitahuan")
                        .setMessage("Mohon maaf, fitur ini belum terimplementasi. Mohon tunggu update selanjutnya. Terimakasih.")
                                //.setIcon(android.R.drawable.ic_dialog_alert)
                        .setPositiveButton("Ya", null)
                        .show();
                break;
            case R.id.bagikan:
                Intent Share = new Intent(Intent.ACTION_SEND);
                Share.setType("text/plain");
                Share.putExtra(Intent.EXTRA_TEXT, "Ayo gunakan aplikasi Pocket Yasin dilengkapi dengan Tahlil dan Ayat Kursi beserta terjemahannya, dapatkan gratis di https://play.google.com/");
                startActivity(Share);
                break;
            case R.id.kritik_saran:
                Intent Email = new Intent(Intent.ACTION_SEND);
                Email.setType("text/email");
                Email.putExtra(Intent.EXTRA_EMAIL, new String[] { "ctproject.developers@gmail.com" });
                Email.putExtra(Intent.EXTRA_SUBJECT, "Feedback Pocket Yasin");
                Email.putExtra(Intent.EXTRA_TEXT, "[Pesan & Saran] ");
                startActivity(Intent.createChooser(Email, "Kirim Saran:"));
                break;
            case R.id.tentang:
                Intent intentKami = new Intent(SettingActivity.this, TentangKamiActivity.class);
                startActivity(intentKami);
                break;
        }

    }
}
