package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class activity_score extends AppCompatActivity {
    TextView t;
    int countValue =6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        t=findViewById(R.id.textView3);


        String count=getIntent().getStringExtra("count").toString();
        t.setText(""+count );
        String message = "Cheers to a true champion Your score of " + count + " is simply extraordinary.";

        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();




    }
    public void exit(View view)
    {

        finish();
        System.exit(0);
    }
    public void play(View view)
    {
        Intent ref=new Intent(this,MainActivity.class);
        startActivity(ref);
    }



}