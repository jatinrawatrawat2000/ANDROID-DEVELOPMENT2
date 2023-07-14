package com.example.yogaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileDescriptor;
import java.io.PrintWriter;

public class LoginActivity extends AppCompatActivity {
    EditText emailtext, passwordtext,username;
    String remail, rpassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        emailtext = findViewById(R.id.email);
        passwordtext = findViewById(R.id.Password);
        username=findViewById(R.id.edittext3);
        remail = getIntent().getStringExtra("email").toString();
        rpassword = getIntent().getStringExtra("password").toString();
    }

    public void login(View view) {
        String email = emailtext.getText().toString();
        String password = passwordtext.getText().toString();
        String user=username.getText().toString();
        if (!(email.equals(remail)) && (password.equals(rpassword))) {
            Toast.makeText(this, "password or email is not matching, Please type properly before typing", Toast.LENGTH_LONG).show();
            return;
        } else {
            Intent ref = new Intent(this, Loginsuccessful.class);
            ref.putExtra("user",user);
            startActivity(ref);
        }
    }
}