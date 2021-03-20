package com.example.linearlayoutyogaaditya;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;

    EditText edemail, edpassword;

    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin=findViewById(R.id.bsingnin);

        edemail=findViewById(R.id.email);

        edpassword=findViewById(R.id.password);

        btnLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                nama = edemail.getText().toString();
                password = edpassword.getText().toString();
                String email = "admin@mail.com";
                String pass = "123";

                if(nama.isEmpty() || password.isEmpty()) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email & Password wajib diisi!",
                            Toast.LENGTH_LONG);
                    t.show();

                } else {

                    if (nama.equals(email) && password.equals(pass)) {
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login Sukses", Toast.LENGTH_LONG);
                        t.show();

                        Bundle b = new Bundle();

                        b.putString("a", nama.trim());

                        b.putString("b", password.trim());

                        Intent i = new Intent(getApplicationContext(), activity_kedua.class);

                        i.putExtras(b);

                        startActivity(i);

                    } else {
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login Gagal" , Toast.LENGTH_LONG);
                        t.show();

                    }
                }
            }
        });
    }
}