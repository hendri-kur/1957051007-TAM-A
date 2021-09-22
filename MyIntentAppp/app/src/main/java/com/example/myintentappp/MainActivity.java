package com.example.myintentappp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button tombol,tombolpindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tombol = (Button) findViewById(R.id.tombol);
        tombolpindah = (Button) findViewById(R.id.tombolpindahData);
        tombol.setOnClickListener(this);
        tombolpindah.setOnClickListener(this);


    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.tombol:
                Intent pindah = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(pindah);
                break;
            case R.id.tombolpindahData:
                Intent pemindahdata = new Intent(MainActivity.this,MainActivity3.class);
                pemindahdata.putExtra(MainActivity3.EXTRA_NAMA, "Hendri");
                pemindahdata.putExtra(MainActivity3.EXTRA_UMUR, 20);
                startActivity(pemindahdata);
                break;
        }
    }
}