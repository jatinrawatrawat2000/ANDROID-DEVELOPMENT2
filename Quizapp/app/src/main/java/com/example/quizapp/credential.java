package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class credential extends AppCompatActivity {
    Button b1;
    EditText e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credential);
        e=findViewById(R.id.editTextText);
        b1=findViewById(R.id.button8);

    }
    public void forwad(View view)
    {
        String user=e.getText().toString();
        Intent ref=new Intent(this,MainActivity.class);
        ref.putExtra("user",user);
        startActivity(ref);
    }
}