package com.example.steam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText ETName;
    EditText ETPassword;
    Button BtnSignin;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // konek var komponen ke layoutnya
        ETName = findViewById(R.id.ETName);
        ETPassword = findViewById(R.id.ETPassword);
        BtnSignin = findViewById(R.id.BtnSignin);
        BtnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // ini action kliknya button login
                String username = ETName.getText().toString();
                String password = ETPassword.getText().toString();

                if (username.equals("admin") && password.equals("admin")){
                    // menuju ke activity kalkulator
                    Intent intent = new Intent(MainActivity.this, MainActivitykalkulator.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this, "Gagal login", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}