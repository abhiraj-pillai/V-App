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

public class vloungeMenu extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vlounge_menu);


       /* Intent menuActivity = getIntent();
        String id = (String) menuActivity.getStringExtra("ID");
        TextView txt = (TextView) findViewById(R.id.textView);
        txt.setText(id);*/

        listView =  findViewById(R.id.menuList);

        final ArrayList<menuItem> item = new ArrayList<>();
        item.add(new menuItem(R.drawable.meduvada,"Veg Sandwich",30));
        item.add(new menuItem(R.drawable.meduvada,"Veg Cheese Toast",45));
        item.add(new menuItem(R.drawable.meduvada,"Veg Cheese Schezwan Toast",65));
        item.add(new menuItem(R.drawable.meduvada,"Sev Puri",30));item.add(new menuItem(R.drawable.meduvada,"Bhel Puri",30));item.add(new menuItem(R.drawable.meduvada,"Dahi Chaat",30));
        item.add(new menuItem(R.drawable.meduvada,"Wada Pav",15));
        item.add(new menuItem(R.drawable.meduvada,"Samosa",20));
        item.add(new menuItem(R.drawable.meduvada,"Misal Pav",25));
        item.add(new menuItem(R.drawable.meduvada,"Tea",10));
        item.add(new menuItem(R.drawable.meduvada,"Coffee",10));





        ListAdaptedMain update = new ListAdaptedMain(this,R.layout.listviewstructure_main,item);

        listView.setAdapter(update);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String Foodname = item.get(position).Name;
                Integer Foodprice = item.get(position).Price;
                Integer Foodphoto = item.get(position).Image;
                Log.i("Foodname",Foodname);
                Intent intent = new Intent(vloungeMenu.this,itemDesc.class);
                intent.putExtra("Foodname",Foodname);
                intent.putExtra("Foodprice",Foodprice);
                intent.putExtra("Foodphoto",Foodphoto);
                startActivity(intent);

            }
        });
    }
}
