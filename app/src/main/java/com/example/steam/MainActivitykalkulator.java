package com.example.steam;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivitykalkulator extends AppCompatActivity {

    EditText angka1;
    EditText angka2;
    Spinner spiner;
    TextView hasil;
    Button tombol;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitykalkulator);

        angka1 = findViewById(R.id.angka1);
        angka2 = findViewById(R.id.angka2);
        hasil = findViewById(R.id.hasil);
        spiner = findViewById(R.id.spiner);
        tombol = findViewById(R.id.tombol);
        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //action kalkulasi angka1 dan 2
                int Angka1 = Integer.parseInt(angka1.getText().toString());
                int Angka2 = Integer.parseInt(angka2.getText().toString());
                int Hasil = 0;
                String text = spiner.getSelectedItem().toString();
                switch (text) {
                    case "Tambah":
                        Hasil = Angka1 + Angka2;
                        hasil.setText(Hasil + "");
                        break;

                    case "Kurang":
                        Hasil = Angka1 - Angka2;
                        hasil.setText(Hasil + "");
                        break;

                    case "Kali":
                        Hasil = Angka1 * Angka2;
                        hasil.setText(Hasil + "");
                        break;

                    case "Bagi":
                        double angka1double = Double.parseDouble(angka1.getText().toString());
                        double angka2double = Double.parseDouble(angka2.getText().toString());
                        double hasilDouble = angka1double/angka2double;
                        hasil.setText(hasilDouble+"");
                        break;


                }


            }
        });
    }
}