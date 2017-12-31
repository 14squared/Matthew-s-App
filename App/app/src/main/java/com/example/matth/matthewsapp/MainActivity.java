package com.example.matth.matthewsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    public static final String EXTRA_MESSAGE = "com.example.helloandroid.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nextPage(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        Button button = (Button)view;
        String message = button.getText().toString();
        Log.d(TAG, message);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
