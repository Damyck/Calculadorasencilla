package com.example.marc.calculadora;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by Marc on 28/11/2016.
 */

public class UI2 extends AppCompatActivity{

    String tag = "Events";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        Log.d(tag, "event onCreate()");
    }

    protected void onStart(){
        super.onStart();
        Log.d(tag, "event onStart()");
    }

    protected void onResume(){

        super.onResume();
        Log.d(tag, "event onResume()");
    }

    protected void onPause(){
        super.onPause();
        Log.d(tag, "event onPause()");
    }

    protected void onStop(){
        super.onStop();
        Log.d(tag, "event onStop()");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.d(tag, "event onDestroy()");
    }

}
