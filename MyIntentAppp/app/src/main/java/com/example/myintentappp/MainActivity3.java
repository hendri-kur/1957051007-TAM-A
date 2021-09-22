package com.example.myintentappp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    public static String EXTRA_UMUR ="extra_umur";
    public static String EXTRA_NAMA ="extra_nama";

    private TextView tmpilDataTerima;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tmpilDataTerima = (TextView)findViewById(R.id.dataTerima);
        String nama = getIntent().getStringExtra(EXTRA_NAMA);
        int umur = getIntent().getIntExtra(EXTRA_UMUR, 0);
        String text = "Nama :" + nama + ", umur :" + umur;
        tmpilDataTerima.setText(text);
    }
}