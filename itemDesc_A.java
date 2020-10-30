package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class itemDesc extends AppCompatActivity {

    TextView quantity,foodname,foodprice;
    ImageView foodphoto;
    int count=1;
    String Temp1;
    Integer Temp2;
    Integer Temp3;
    Integer amt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_desc);

        Temp1 = (String) getIntent().getStringExtra("Foodname");
        Temp2 = getIntent().getIntExtra("Foodprice",0);
        Temp3 = getIntent().getIntExtra("Foodphoto",0);

        quantity = (TextView) findViewById(R.id.quantity);
        foodname = (TextView) findViewById(R.id.foodname);
        foodprice= (TextView) findViewById(R.id.foodprice);
        foodphoto= (ImageView) findViewById(R.id.foodphoto);


        foodname.setText(Temp1);
        foodprice.setText("Rs-"+Temp2.toString());
        foodphoto.setImageResource(Temp3);
        quantity.setText(String.valueOf(count));


    }



    public void Decrement(View view)
    {
        count--;
        if(count>=1)
        {
            quantity.setText(""+count);

            foodprice.setText("Rs-"+Temp2*count);

        }
        else
            Toast.makeText(this, "Quantity can not be less than 1 !!", Toast.LENGTH_SHORT).show();


    }
    public void Increment(View view)
    {
        count++;
        if(count>=1)
        {
            quantity.setText(""+count);
            foodprice.setText("Rs-"+Temp2*count);
        }

        else
            Toast.makeText(this, "Quantity can not be less than 1 !!", Toast.LENGTH_SHORT).show();;

    }
}
