package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    public void openCanteen(View view){
        Intent canteen = new Intent(this, canteen.class);
        startActivity(canteen);
    }

    public void webviewVit(View view){

        Intent webview = new Intent(this,webviewVit.class);
        startActivity(webview);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
