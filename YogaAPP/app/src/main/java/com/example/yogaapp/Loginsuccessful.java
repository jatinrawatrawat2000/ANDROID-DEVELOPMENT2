package com.example.yogaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Loginsuccessful extends AppCompatActivity {
    Button b1,b2,b3,b4;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginsuccessful);
        b1=findViewById(R.id.button2);
        b2=findViewById(R.id.button3);
        b3=findViewById(R.id.button4);
        b4=findViewById(R.id.button5);
        String username = getIntent().getStringExtra("user").toString();
        t1=findViewById(R.id.textView2);
        t1.setText(""+username);

    }
    public void Triona(View view)
    {
        Intent ref=new Intent(this,Trikonasana.class);
        startActivity(ref);

    }
    public void shavasana(View view)
    {
        Intent ref=new Intent(this,shavasana.class);
        startActivity(ref);
    }
    public void lowlungs(View view)
    {
        Intent ref=new Intent(this,lowlungs.class);
        startActivity(ref);
    }
    public void dhanurasana(View view)
    {
        Intent ref=new Intent(this,dhanurasana.class);
        startActivity(ref);
    }
    public void exit(View view)
    {
        Intent ref=new Intent(Loginsuccessful.this,MainActivity.class);
        startActivity(ref);
        finish();
        System.exit(0);

    }



}