package com.example.dinesh.showingandhidinguielements;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textview;


    public void show(View view){
        textview.setVisibility(view.VISIBLE);

    }

    public void hide(View view){
        textview.setVisibility(view.INVISIBLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview = (TextView) findViewById(R.id.textview);

    }
}
