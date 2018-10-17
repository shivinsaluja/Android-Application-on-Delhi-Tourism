package com.example.android.delhitourism;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mus);
    }
    public void dollmuseum(View view)
    {
        Intent n =new Intent(this,DollMuseumActivity.class);
        startActivity(n);
    }
    public void railmuseum(View view)
    {
        Intent n =new Intent(this,RailMuseumActivity.class);
        startActivity(n);
    }
    public void gandhimuseum(View view)
    {
        Intent n =new Intent(this,NationalGandhiMuseumActivity.class);
        startActivity(n);
    }
    public void sciencecenter(View view)
    {
        Intent n =new Intent(this,NationalScienceCenterActivity.class);
        startActivity(n);
    }
    public void modernart(View View)
    {
        Intent n =new Intent(this,ModernArtGallery.class);
        startActivity(n);
    }
}
