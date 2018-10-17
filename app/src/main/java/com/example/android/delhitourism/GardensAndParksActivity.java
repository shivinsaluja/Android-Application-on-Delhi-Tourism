package com.example.android.delhitourism;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GardensAndParksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gardens_and_parks);
    }
    public void lodhigarden(View view)
    {
        Intent n =new Intent(this,LodhiGardensActivity.class);
        startActivity(n);
    }
    public void talkatora(View view)
    {
        Intent n =new Intent(this,TalkatoraActivity.class);
        startActivity(n);
    }
    public void garden5senses(View view)
    {
        Intent n =new Intent(this,Garden5SensesActivity.class);
        startActivity(n);
    }
    public void deerpark(View view)
    {
        Intent n =new Intent(this,DeerParkActivity.class);
        startActivity(n);
    }
    public void mughalgarden(View View)
    {
        Intent n =new Intent(this,MughalGardensActivity.class);
        startActivity(n);
    }
}
