package com.example.matth.matthewsapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private static final String TAG = "MainActivity";
    public static final String EXTRA_MESSAGE = "com.example.helloandroid.MESSAGE";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mTextMessage = (TextView) findViewById(R.id.message);



    }
    public void nextPage(View view) {
        Log.d(TAG, "Switching to next page");
        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        v.vibrate(100);
        Intent intent = new Intent(this, SecondActivity.class);
        Button button = (Button)view;
        String message = button.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        Log.d(TAG, message);
        startActivity(intent);

    }

}
