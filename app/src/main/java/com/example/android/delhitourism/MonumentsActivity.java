package com.example.android.delhitourism;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MonumentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monuments);
    }
    public void redfort(View view)
    {
        Intent n =new Intent(this,RedFortActivity.class);
        startActivity(n);
    }
    public void indiagate(View view)
    {
        Intent n =new Intent(this,IndiaGateActivity.class);
        startActivity(n);
    }
    public void jantarmantar(View view)
    {
        Intent n =new Intent(this,HumanyuTombActivity.class);
        startActivity(n);
    }
    public void puranaquila(View view)
    {
        Intent n =new Intent(this,PuranaQActivity.class);
        startActivity(n);
    }
    public void qutubminar(View View)
    {
        Intent n =new Intent(this,QutubMinarActivity.class);
        startActivity(n);
    }
}
