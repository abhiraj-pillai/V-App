package com.example.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class ListAdaptedMain extends ArrayAdapter<menuItem> {
    private Context mContext;
    private int mResource;



    public ListAdaptedMain(Context context, int resource, ArrayList<menuItem> objects){

        super(context,resource,objects);
        this.mContext=context;
        this.mResource=resource;
    }


    public View getView(int pos, View view, ViewGroup parent){
        LayoutInflater inflater = LayoutInflater.from(mContext);

        view = inflater.inflate(mResource,parent,false);

        ImageView imageView = view.findViewById(R.id.imageView);
        TextView nameView = view.findViewById(R.id.nameView);
        TextView priceView = view.findViewById(R.id.priceView);

        imageView.setImageResource(getItem(pos).getImage());
        nameView.setText(getItem(pos).getName());
        String stringPrice = String.valueOf(getItem(pos).getPrice());

        priceView.setText(stringPrice);

        return view;
    }
}
