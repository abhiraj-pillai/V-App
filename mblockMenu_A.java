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

public class mblockMenu extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mblock_menu);


        /*Intent menuActivity = getIntent();
        String id = (String) menuActivity.getStringExtra("ID");
        TextView txt = (TextView) findViewById(R.id.textView);
        txt.setText(id);*/

        listView =  findViewById(R.id.menuList);

        final ArrayList<menuItem> item = new ArrayList<>();
        item.add(new menuItem(R.drawable.noodles,"Veg Roll",35));
        item.add(new menuItem(R.drawable.noodles,"Veg Cheese Roll",45));
        item.add(new menuItem(R.drawable.noodles,"Veg Schezwan Roll",45));
        item.add(new menuItem(R.drawable.noodles,"Veg Cheese Schezwan Roll",55));item.add(new menuItem(R.drawable.noodles,"Noodle Roll",40));item.add(new menuItem(R.drawable.noodles,"Paneer Chilli",60));item.add(new menuItem(R.drawable.noodles,"Potato Chilli",60));
        item.add(new menuItem(R.drawable.noodles,"Schezwan Noodles",65));
        item.add(new menuItem(R.drawable.noodles,"Hakka Noodles",65));item.add(new menuItem(R.drawable.noodles,"Sada Dosa",30));item.add(new menuItem(R.drawable.noodles,"Masala Dosa",45));
        item.add(new menuItem(R.drawable.noodles,"Mysore Dosa",50));
        item.add(new menuItem(R.drawable.noodles,"Manchurian Dosa",65));
        item.add(new menuItem(R.drawable.noodles,"Bisleri",10));
        item.add(new menuItem(R.drawable.noodles,"Limca",20));


        ListAdaptedMain update = new ListAdaptedMain(this,R.layout.listviewstructure_main,item);

        listView.setAdapter(update);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String Foodname = item.get(position).Name;
                Integer Foodprice = item.get(position).Price;
                Integer Foodphoto = item.get(position).Image;
                Log.i("Foodname",Foodname);
                Intent intent = new Intent(mblockMenu.this,itemDesc.class);
                intent.putExtra("Foodname",Foodname);
                intent.putExtra("Foodprice",Foodprice);
                intent.putExtra("Foodphoto",Foodphoto);
                startActivity(intent);

            }
        });
    }
}
