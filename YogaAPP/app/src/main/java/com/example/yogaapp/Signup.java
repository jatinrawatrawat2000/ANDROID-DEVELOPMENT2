package com.example.yogaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;

public class Signup extends AppCompatActivity {
    EditText emailtext,passwordtext;


    ImageView imageView;
    TextView textView;
    Animation up,down;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        emailtext=findViewById(R.id.editText1);
        passwordtext=findViewById(R.id.editText2);

    }
    public void signup(View view){
        String email=emailtext.getText().toString();
        String password=passwordtext.getText().toString();
        if(!isvalidpassword(password)){
            Toast.makeText(this,"Enter valid Password",Toast.LENGTH_LONG).show();
            return;
        }
        Intent obj=new Intent(this,LoginActivity.class);
        obj.putExtra("email",email);
        obj.putExtra("password",password);
        startActivity(obj);
    }
    Pattern lowercase=Pattern.compile("^.*[a-z].*$");
    Pattern uppercase=Pattern.compile("^.*[A-Z].*$");
    Pattern numchar=Pattern.compile("^.*[0-9].*$");
    Pattern spchar=Pattern.compile("^.*[^a-zA-Z0-9].*$");

    public boolean isvalidpassword(String password){
        if((password.length() <8)) {
            return false;
        }
        if (!(lowercase.matcher(password).matches())){
            return false;
        }
        if (!(uppercase.matcher(password).matches())){
            return false;
        }
        if (!(numchar.matcher(password).matches())){
            return false;
        }
        if (!(spchar.matcher(password).matches())){
            return false;
        }
        return true;
    }

}