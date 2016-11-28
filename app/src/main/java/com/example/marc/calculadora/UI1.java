package com.example.marc.calculadora;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class UI1 extends AppCompatActivity {
    String tag = "Events";
    String op;
    double result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void getOp(View v){
        boolean checked = ((RadioButton)v).isChecked();
        op = null;

        switch (v.getId()){
            case R.id.suma:
                if (checked) op = "suma";
                break;
            case R.id.resta:
                if (checked) op = "resta";
                break;
            case R.id.multiplicacion:
                if (checked) op = "multiplicacion";
                break;
            case R.id.division:
                if (checked) op = "division";
                break;
        }


    }

    public void erase(View v){
        EditText numberOne = (EditText) findViewById(R.id.n1);
        EditText numberTwo = (EditText) findViewById(R.id.n2);
        TextView res = (TextView) findViewById(R.id.result);

        numberOne.setText("0");
        numberTwo.setText("0");
        res.setText("0");
    }

    public void calculate(View v){

        try{
            EditText numberOne = (EditText) findViewById(R.id.n1);
            EditText numberTwo = (EditText) findViewById(R.id.n2);
            int n1 = Integer.parseInt(numberOne.getText().toString());
            int n2 = Integer.parseInt(numberTwo.getText().toString());

            if (op == "suma"){
                result = n1+n2;
            }
            if (op == "resta"){
                result = n1-n2;
            }
            if (op == "multiplicacion"){
                result = n1*n2;
            }
            if (op == "division"){
                result = n1/n2;
            }

            TextView res = (TextView) findViewById(R.id.result);
            res.setText("" + result);

        }
        catch(Exception e){

            Context c = getApplicationContext();
            CharSequence t = "Indica los números";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(c,t,duration);
            toast.show();

        }

    }

}
