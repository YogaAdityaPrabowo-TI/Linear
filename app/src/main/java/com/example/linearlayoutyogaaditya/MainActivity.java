package com.example.linearlayoutyogaaditya;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText tEmail;
    EditText tPassword;
    TextView output;
    Button bsignin;
    String Email;
    String Password;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tEmail = (EditText) findViewById(R.id.email);
        tPassword = (EditText) findViewById(R.id.password);
        bsignin = (Button) findViewById(R.id.bsingnin);
        output= (TextView) findViewById(R.id.output);

        bsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Email = tEmail.getText().toString();
                Password = tPassword.getText().toString();

                if(tEmail.getText().toString().equals("ayoga1284@mail.com")&&tPassword.getText().toString().equals("141000")) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "LOGIN SUKSES || email : " + Email + " password : " + Password + "", Toast.LENGTH_LONG);
                    t.show();
                }
                else if (!tEmail.getText().toString().equals("ayoga1284@mail.com")&&tPassword.getText().toString().equals("141000")) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            " Email Anda salah ", Toast.LENGTH_SHORT);
                    t.show();
                }
                else if (!tPassword.getText().toString().equals("123")&&tEmail.getText().toString().equals("admin@mail.com")) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            " Password Anda salah ", Toast.LENGTH_SHORT);
                    t.show();
                }
                else{
                    Toast.makeText((getApplicationContext()), "Username atau Password Anda salah",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}