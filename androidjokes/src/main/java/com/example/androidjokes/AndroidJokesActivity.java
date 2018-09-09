package com.example.androidjokes;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class AndroidJokesActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.android_jokes);

        String jokeResult = getIntent().getStringExtra("result");
        TextView result = (TextView) findViewById(R.id.tv_result);
        result.setText(jokeResult);
    }
}
