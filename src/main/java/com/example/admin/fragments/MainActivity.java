package com.example.admin.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TopSecFragment.TopSectionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void creatememe(String top, String bottom)
    {
        BottonSecFragment bot = (BottonSecFragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        bot.setText(top,bottom);

    }
}
