package com.example.android.delhitourism;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void monuments(View view)
    {
        Intent monument=new Intent(this,MonumentsActivity.class);
        startActivity(monument);
    }
    public void museums(View view)
    {
        Intent museums=new Intent(this,MusActivity.class);
        startActivity(museums);
    }
    public void placesofworship(View view)
    {
        Intent monument=new Intent(this,PlacesOfWorshipActivity.class);
        startActivity(monument);
    }
    public void gardensandparks(View view)
    {
        Intent monument=new Intent(this,GardensAndParksActivity.class);
        startActivity(monument);
    }
}
