package com.example.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class canteen extends AppCompatActivity implements View.OnClickListener {
    private View view;
    private CardView ccd,mblock,vlounge,dominos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canteen);

        CardView ccd = (CardView) findViewById(R.id.ccdCard);
        CardView mblock = (CardView) findViewById(R.id.mblockCard);
        CardView vlounge = (CardView) findViewById(R.id.vloungeCard);
        CardView dominos = (CardView) findViewById(R.id.dominosCard);

        ccd.setOnClickListener(this);
        mblock.setOnClickListener(this);
        vlounge.setOnClickListener(this);
        dominos.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent menuActivity;

        switch (v.getId()){
            case R.id.ccdCard : menuActivity = new Intent(this,ccdMenu.class); menuActivity.putExtra("ID","ccd"); startActivity(menuActivity);break;
            case R.id.mblockCard : menuActivity = new Intent(this,mblockMenu.class);menuActivity.putExtra("ID", "mblock"); startActivity(menuActivity);break;
            case R.id.vloungeCard : menuActivity = new Intent(this,vloungeMenu.class);menuActivity.putExtra("ID","vlounge");startActivity(menuActivity);break;
            case R.id.dominosCard : menuActivity = new Intent(this,dominosMenu.class);menuActivity.putExtra("ID","dominos");startActivity(menuActivity);break;
        }
    }
    }
