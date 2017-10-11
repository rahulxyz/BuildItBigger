package com.rahulxyz.jokesandroidlib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import com.example.*;

public class JokeAndActivity extends AppCompatActivity {

    public static String JOKE="Jokes";
    TextView joke_tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_and);
        joke_tv= (TextView) findViewById(R.id.joke_tv);
        Intent intent= getIntent();
        if(intent.hasExtra(JOKE)){
            joke_tv.setText(intent.getStringExtra(JOKE));
        }else{
            joke_tv.setText("Jokes not available.");
        }



    }
}
