package com.example.app;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ccdMenu extends AppCompatActivity {

    ListView listView;

   /* final String[] vloungeMenuNameArray = {
            "Veg Sandwiches" ,
            "Veg Toast Sandwiches",
            "Veg Cheese Sandwiches",
            "Veg Cheese toastSandwiches" ,
            "Veg Schezwan Sandwiches" ,
            "Veg Cheese schezwan Sandwiches",
            "Papdi chaat" ,
            "Sec puri" ,
            "Bhel puri" ,
            "Dahi chaat",
            "Samosa sambaar",
            "Misal pav" ,
            "Batata vada" ,
            "Idli" ,
            "Medu vada" ,
            "Samosa" ,
            "Batata pattice",
            "Coffee" ,
            "Tea" ,
            "Lassi" ,
            "Fanta" ,
            "Mountain dew" ,
            "Pepsi" ,
            "Thumbs up" ,
            "Chocolate drink",
            "Extra Paav"
    };
    final Integer[] vloungeMenuPriceArray = {
            60,
            70,
            80,
            80,
            80,
            90,
            30,
            40,
            40,
            50,
            40,
            30,
            20,
            20,
            20,
            10,
            10,
            10,
            20,
            20,
            20,
            20,
            40,
            5,
            10,
            10
    }; */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ccd_menu);


        /*Intent menuActivity = getIntent();
        String id = (String) menuActivity.getStringExtra("ID");
        TextView txt = (TextView) findViewById(R.id.textView);
        txt.setText(id); */

//        ListAdapter update =  new ListAdapter(this,vloungeMenuNameArray,vloungeMenuPriceArray);

        listView =  findViewById(R.id.menuList);
        final ArrayList<menuItem> item = new ArrayList<>();

        item.add(new menuItem(R.drawable.dosa,"Espresso",50));
        item.add(new menuItem(R.drawable.dosa,"Tropical Iceberg",45));
        item.add(new menuItem(R.drawable.dosa,"Kadak Chai",50));
        item.add(new menuItem(R.drawable.dosa,"Veg Cup Noodles",35));
        item.add(new menuItem(R.drawable.dosa,"Manchow Cup Noodles",35));
        item.add(new menuItem(R.drawable.dosa,"Chicken Cup Noodles",35));
        item.add(new menuItem(R.drawable.dosa,"Chicken Spinach Sandwich",80));
        item.add(new menuItem(R.drawable.dosa,"Lemon Slushie",20));
        item.add(new menuItem(R.drawable.dosa,"Chocolate Shot",35));
        item.add(new menuItem(R.drawable.dosa,"Brownie",60));

        ListAdaptedMain update = new ListAdaptedMain(this,R.layout.listviewstructure_main,item);

        listView.setAdapter(update);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String Foodname = item.get(position).Name;
                Integer Foodprice = item.get(position).Price;
                Integer Foodphoto = item.get(position).Image;
                Log.i("Foodname",Foodname);
                Intent intent = new Intent(ccdMenu.this,itemDesc.class);
                intent.putExtra("Foodname",Foodname);
                intent.putExtra("Foodprice",Foodprice);
                intent.putExtra("Foodphoto",Foodphoto);
                startActivity(intent);

            }
        });

    }


    }




