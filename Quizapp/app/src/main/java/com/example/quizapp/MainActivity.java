package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button b_answer1,b_answer2,b_answer3,b_answer4;
    Switch sw ;
    ImageView imageView;
    List<CountryItem> list;
    Random r;
    int turn=1;
    int count=0;
    MediaPlayer Player;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r=new Random();
        imageView=(ImageView)findViewById(R.id.imageView);
        b_answer1=(Button)findViewById(R.id.button);
        b_answer2=(Button)findViewById(R.id.button2);
        b_answer3=(Button)findViewById(R.id.button3);
        b_answer4=(Button)findViewById(R.id.button4);
        sw=findViewById(R.id.switch2);


        list=new ArrayList<>();
        for (int i=0;i< new Database().answers.length;i++)
        {
            list.add(new CountryItem(new Database().answers[i],new Database().flags[i]));
        }
        Collections.shuffle(list);
        newQuestion(turn);

        b_answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b_answer1.getText().toString().equalsIgnoreCase(list.get(turn-1).getName())){
                    Toast.makeText(MainActivity.this,"CORRECT!",Toast.LENGTH_SHORT).show();
                    if(turn< list.size()){
                        turn++;
                        count++;
                        newQuestion(turn);
                    }else {
                        Toast.makeText(MainActivity.this,"YOU FINISHED THE GAME!",Toast.LENGTH_SHORT).show();

                    }
                }
                else {
                    Toast.makeText(MainActivity.this,"WRONG!",Toast.LENGTH_SHORT).show();
//                    Toast.makeText(MainActivity.this,"YOU LOST THE GAME!",Toast.Length).show();
                    Intent i=new Intent(MainActivity.this,activity_score.class);
                    i.putExtra("count",String.valueOf(count));
                    startActivity(i);







                }

            }
        });

        b_answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b_answer2.getText().toString().equalsIgnoreCase(list.get(turn-1).getName())){
                    Toast.makeText(MainActivity.this,"CORRECT!",Toast.LENGTH_SHORT).show();
                    if(turn< list.size()){
                        turn++;
                        count++;
                        newQuestion(turn);
                    }else {
                        Toast.makeText(MainActivity.this,"YOU FINISHED THE GAME!",Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(MainActivity.this,"WRONG!",Toast.LENGTH_SHORT).show();
//                    Toast.makeText(MainActivity.this,"YOU LOST THE GAME!",Toast.LENGTH_LONG).show();
                    Intent i=new Intent(MainActivity.this,activity_score.class);
                    i.putExtra("count",String.valueOf(count));
                    startActivity(i);




                }

            }
        });

        b_answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b_answer3.getText().toString().equalsIgnoreCase(list.get(turn-1).getName())){
                    Toast.makeText(MainActivity.this,"CORRECT!",Toast.LENGTH_SHORT).show();
                    if(turn< list.size()){
                        turn++;
                        count++;
                        newQuestion(turn);
                    }else {
                        Toast.makeText(MainActivity.this,"YOU FINISHED THE GAME!",Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(MainActivity.this,"WRONG!",Toast.LENGTH_SHORT).show();
//                    Toast.makeText(MainActivity.this,"YOU LOST THE GAME!",Toast.LENGTH_LONG).show();
                    Intent i=new Intent(MainActivity.this,activity_score.class);
                    i.putExtra("count",String.valueOf(count));
                    startActivity(i);





                }

            }
        });

        b_answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b_answer4.getText().toString().equalsIgnoreCase(list.get(turn-1).getName())){
                    Toast.makeText(MainActivity.this,"CORRECT!",Toast.LENGTH_SHORT).show();
                    if(turn< list.size()){
                        turn++;
                        count++;
                        newQuestion(turn);
                    }else {
                        Toast.makeText(MainActivity.this,"YOU FINISHED THE GAME!",Toast.LENGTH_SHORT).show();
                    }

                }
                else {
                    Toast.makeText(MainActivity.this,"WRONG!",Toast.LENGTH_SHORT).show();
//                    Toast.makeText(MainActivity.this,"YOU LOST THE GAME!",Toast.LENGTH_LONG).show();
                    Intent i=new Intent(MainActivity.this,activity_score.class);
                    i.putExtra("count",String.valueOf(count));
                    startActivity(i);





                }

            }
        });


    }
    public void newQuestion(int number)
    {
        imageView.setImageResource(list.get(number-1).getImage());
        int Correct_answer=r.nextInt(4)+1;
        int firstButton =number -1;
        int secondButton;
        int thirdButton;
        int fourthButton;
        switch (Correct_answer)
        {
            case 1:
                b_answer1.setText(list.get(firstButton).getName());
                do{
                    secondButton=r.nextInt(list.size());

                }while(secondButton ==firstButton);
                do{
                    thirdButton=r.nextInt(list.size());

                }while(thirdButton ==firstButton || thirdButton==secondButton);
                do{
                    fourthButton=r.nextInt(list.size());

                }while(fourthButton ==firstButton || fourthButton==secondButton || fourthButton==thirdButton);
                b_answer2.setText(list.get(secondButton).getName());
                b_answer3.setText(list.get(thirdButton).getName());
                b_answer4.setText(list.get(fourthButton).getName());

                break;

            case 2:
                b_answer2.setText(list.get(firstButton).getName());
                do{
                    secondButton=r.nextInt(list.size());

                }while(secondButton ==firstButton);
                do{
                    thirdButton=r.nextInt(list.size());

                }while(thirdButton ==firstButton || thirdButton==secondButton);
                do{
                    fourthButton=r.nextInt(list.size());

                }while(fourthButton ==firstButton || fourthButton==secondButton || fourthButton==thirdButton);
                b_answer1.setText(list.get(secondButton).getName());
                b_answer3.setText(list.get(thirdButton).getName());
                b_answer4.setText(list.get(fourthButton).getName());


                break;

            case 3:
                b_answer3.setText(list.get(firstButton).getName());
                do{
                    secondButton=r.nextInt(list.size());

                }while(secondButton ==firstButton);
                do{
                    thirdButton=r.nextInt(list.size());

                }while(thirdButton ==firstButton || thirdButton==secondButton);
                do{
                    fourthButton=r.nextInt(list.size());

                }while(fourthButton ==firstButton || fourthButton==secondButton || fourthButton==thirdButton);
                b_answer2.setText(list.get(secondButton).getName());
                b_answer1.setText(list.get(thirdButton).getName());
                b_answer4.setText(list.get(fourthButton).getName());


                break;

            case 4:

                b_answer4.setText(list.get(firstButton).getName());
                do{
                    secondButton=r.nextInt(list.size());

                }while(secondButton ==firstButton);
                do{
                    thirdButton=r.nextInt(list.size());

                }while(thirdButton ==firstButton || thirdButton==secondButton);
                do{
                    fourthButton=r.nextInt(list.size());

                }while(fourthButton ==firstButton || fourthButton==secondButton || fourthButton==thirdButton);
                b_answer2.setText(list.get(secondButton).getName());
                b_answer3.setText(list.get(thirdButton).getName());
                b_answer1.setText(list.get(fourthButton).getName());


                break;
        }
    }
    public void onclick(View view)
    {
        Intent i=new Intent(getApplicationContext(),activity_score.class);
        startActivity(i);
        setContentView(R.layout.activity_score);
    }
    public void swit(View view)

    {
         Switch simpleSwitch1 = (Switch) findViewById(R.id.switch2);
        if (simpleSwitch1.isChecked())
        {

            if(Player != null)

                Player.pause();

        } else {
            if(Player == null)
            {
                Player=MediaPlayer.create(this,R.raw.song);
            }
            Player.start();


            // The toggle is disabled
        }

    }


}
