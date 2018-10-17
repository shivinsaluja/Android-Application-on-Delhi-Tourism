package com.example.android.delhitourism;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PlacesOfWorshipActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_of_worship);
    }
    public void akshardhamtemple(View view)
    {
        Intent n =new Intent(this,AkshardhamActivity.class);
        startActivity(n);
    }
    public void lotustemple(View view)
    {
        Intent n =new Intent(this,LotusTempleActivity.class);
        startActivity(n);
    }
    public void jamamasjid(View view)
    {
        Intent n =new Intent(this,JamaMasjidActivity.class);
        startActivity(n);
    }
    public void jameschurch(View view)
    {
        Intent n =new Intent(this,ChurchActivity.class);
        startActivity(n);
    }
    public void banglasahib(View View)
    {
        Intent n =new Intent(this,BanglaSahibActivity.class);
        startActivity(n);
    }

}
