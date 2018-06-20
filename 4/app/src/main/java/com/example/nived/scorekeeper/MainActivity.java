package com.example.nived.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    int value1=0,value2=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void reset(View view){
        TextView v =(TextView)findViewById(R.id.display_text);
        Toast.makeText(MainActivity.this,"Reset",Toast.LENGTH_SHORT).show();
        v.setText("0");
    }

    public void reset_1(View view){
        TextView v =(TextView)findViewById(R.id.display_text_view);
        Toast.makeText(MainActivity.this,"Reset",Toast.LENGTH_SHORT).show();
        v.setText("0");
    }
    public void one(View view){
        //Button one = (Button)findViewById(R.id.one);
        int a=1;
        displayValue(a);
    }

    public void two(View view){
        int a=2;
        displayValue(a);
    }

    public void three(View view){
        int a=3;
        displayValue(a);
    }

    public void one_1(View view){
        int a=1;
        display_1(a);
    }

    public void two_1(View view){
        int a=2;
        display_1(a);
    }

    public void three_1(View view){
        int a=3;
        display_1(a);
    }


    public void displayValue(int y){
        TextView v =(TextView)findViewById(R.id.display_text);
        value1+=y;
        v.setText(""+value1);
    }

    public void display_1(int y){
        TextView v =(TextView)findViewById(R.id.display_text_view);
        value2+=y;
        v.setText(""+value2);
    }
}
