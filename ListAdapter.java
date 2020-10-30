package com.example.app;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ListAdapter extends ArrayAdapter<String> {


    private final Activity context;
    private final String[] nameArray;
    private final Integer[] priceArray;



    public ListAdapter(Activity context,String[] nameArrayParam, Integer[] priceArrayParam) {

        super(context,R.layout.listviewstructure,nameArrayParam);

        this.context = context;
        this.nameArray= nameArrayParam;
        this.priceArray = priceArrayParam;
    }

    public View getView(int pos, View v, ViewGroup parent){

        LayoutInflater inflater = context.getLayoutInflater();
        @SuppressLint("ViewHolder") View view = inflater.inflate(R.layout.listviewstructure, null, true);

        TextView nameView = (TextView) view.findViewById(R.id.nameView);
        TextView priceView = (TextView) view.findViewById(R.id.priceView);

        nameView.setText(nameArray[pos]);
        priceView.setText(priceArray[pos].toString());

        return view;
    }
}