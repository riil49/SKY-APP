package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class adabter extends ArrayAdapter <items2> {

    private Context mcox;
    private int mResource;

    public adabter(@NonNull Context context, int resource, @NonNull ArrayList<items2> objects) {
        super(context, resource, objects);
        this.mcox=context;
        this.mResource=resource;
    }
    @NonNull
    @Override
    public View getView (int position, @NonNull View converView , @NonNull ViewGroup parent){

        if (converView == null) {
            converView = LayoutInflater.from(getContext()).inflate(R.layout.recycler_item,parent,false) ;
        }
        LayoutInflater layoutInflater = LayoutInflater.from(mcox);
        converView = layoutInflater.inflate(mResource,parent, false);
        ImageView imageView = converView.findViewById(R.id.image);
        TextView textView= converView.findViewById(R.id.listText);
        TextView textView1 = converView.findViewById(R.id.sub_listText);
        imageView.setImageResource(getItem(position).getImage());
        textView.setText(getItem(position).getItems());
        textView1.setText(getItem(position).getSubItems());

        return converView ;
    } }
