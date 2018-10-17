package com.example.android.delhitourism;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FoodandShoppingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodand_shopping);
    }
    public void khanmarket(View view)
    {
        Intent n =new Intent(this,KhanMarketActivity.class);
        startActivity(n);
    }
    public void dillihaat(View view)
    {
        Intent n =new Intent(this,DilliHaatActivity.class);
        startActivity(n);
    }
    public void cp(View view)
    {
        Intent n =new Intent(this,CpActivity.class);
        startActivity(n);
    }
    public void chandnichowk(View view)
    {
        Intent n =new Intent(this,ChandniChowkActivity.class);
        startActivity(n);
    }
    public void janpath(View view)
    {
        Intent n =new Intent(this,JanpathMarketActivity.class);
        startActivity(n);
    }
    public void ihc(View view)
    {
        Intent n =new Intent(this,HabitatCenterActivity.class);
        startActivity(n);
    }
}
