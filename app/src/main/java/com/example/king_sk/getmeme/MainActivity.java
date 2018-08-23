package com.example.king_sk.getmeme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements topfragment.TopSectionListner {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void createMeme(String top, String bottom) {
        bottomfragment bottomfrag = (bottomfragment) getSupportFragmentManager().findFragmentById(R.id.fragment4);
        bottomfrag.setMemeText(top, bottom);
    }
}

