package com.example.linearlayoutyogaaditya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

public class ActivityLihatData extends AppCompatActivity {

    TextView tvnama, tvnomor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        tvnama = findViewById(R.id.tvNAMAKontak);
        tvnomor = findViewById(R.id.tvNomorTelepon);

        Bundle bundle = getIntent().getExtras();

        String nama = bundle.getString("a");

        switch (nama){
            case "Yoga":
                tvnama.setText("Yoga A");
                tvnomor.setText("089630775720");
                break;
            case "Aditya":
                tvnama.setText("Aditya P");
                tvnomor.setText("089640775720");
                break;
            case "Prabowo":
                tvnama.setText("Prabowo Y");
                tvnomor.setText("089650775720");
                break;
            case "Intan":
                tvnama.setText("Intan p");
                tvnomor.setText("089660775720");
                break;
            case "Niken":
                tvnama.setText("Niken Y");
                tvnomor.setText("089670775720");
                break;
            case "Astrid":
                tvnama.setText("Astrid S");
                tvnomor.setText("089680775720");
                break;
            case "Putri":
                tvnama.setText("Putri H");
                tvnomor.setText("089690775720");
                break;
            case "Raisa":
                tvnama.setText("Raisa M");
                tvnomor.setText("089700775720");
                break;
            case "Defa":
                tvnama.setText("Defa P");
                tvnomor.setText("089710775720");
                break;
            case "Dita":
                tvnama.setText("Dita P");
                tvnomor.setText("089720775720");
                break;
        }
    }
}