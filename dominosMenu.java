package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class dominosMenu extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dominos_menu);


        listView =  findViewById(R.id.menuList);

        final ArrayList<menuItem> item = new ArrayList<>();
        item.add(new menuItem(R.drawable.meduvada,"Meduvada",40));
        item.add(new menuItem(R.drawable.meduvada,"Meduvada",40));
        item.add(new menuItem(R.drawable.meduvada,"Meduvada",40));
        item.add(new menuItem(R.drawable.meduvada,"Meduvada",40));item.add(new menuItem(R.drawable.meduvada,"Meduvada",40));item.add(new menuItem(R.drawable.meduvada,"Meduvada",40));
        item.add(new menuItem(R.drawable.meduvada,"Meduvada",40));
        item.add(new menuItem(R.drawable.meduvada,"Meduvada",40));
        item.add(new menuItem(R.drawable.meduvada,"Meduvada",40));
        item.add(new menuItem(R.drawable.meduvada,"Meduvada",40));
        item.add(new menuItem(R.drawable.meduvada,"Meduvada",40));


        ListAdaptedMain update = new ListAdaptedMain(this,R.layout.listviewstructure_main,item);

        listView.setAdapter(update);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String Foodname = item.get(position).Name;
                Integer Foodprice = item.get(position).Price;
                Integer Foodphoto = item.get(position).Image;
                Log.i("Foodname",Foodname);
                Intent intent = new Intent(dominosMenu.this,itemDesc.class);
                intent.putExtra("Foodname",Foodname);
                intent.putExtra("Foodprice",Foodprice);
                intent.putExtra("Foodphoto",Foodphoto);
                startActivity(intent);

            }
        });

    }
}
