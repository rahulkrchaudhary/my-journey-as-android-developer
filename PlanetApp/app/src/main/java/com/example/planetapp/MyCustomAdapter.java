package com.example.planetapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyCustomAdapter extends ArrayAdapter<Planet> {
    // using custom layout--> MyCustomAdapter
    // using custom objects --> extends ArrayAdapter<Planet>
    // we are using ArrayAdapter because we are using planet model class

    Context context;
    private ArrayList<Planet>planetArrayList;

    public MyCustomAdapter(ArrayList<Planet> planetArrayList, Context context) {
        super(context, R.layout.item_list_layout, planetArrayList);

        this.planetArrayList = planetArrayList;
        this.context = context;
    }
    private class MyViewHolder {
        TextView planetName;
        TextView moonCount;
        ImageView planetImg;
    }


        // getView()--used to create and return a view for a
        // specific item in the list
        @NonNull
        @Override

        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){


            //1. get the planet object for the current position
            Planet planet = getItem(position);


            //2. inflate layout
            MyViewHolder myViewHolder;
            final View result;

            if(convertView==null){
                myViewHolder = new MyViewHolder();
                LayoutInflater inflater = LayoutInflater.from(getContext());
                convertView = inflater.inflate(
                        R.layout.item_list_layout,
                        parent,
                        false
                );
                // finding View
                myViewHolder.planetName=(TextView) convertView.findViewById(R.id.textview1);
                myViewHolder.moonCount=(TextView) convertView.findViewById(R.id.textview2);
                myViewHolder.planetImg=(ImageView) convertView.findViewById(R.id.image);

                result = convertView;

                convertView.setTag(myViewHolder);

            }else{

                // the view is recycled
                myViewHolder= (MyViewHolder) convertView.getTag();
                result = convertView;
            }

            //getting the data from the model class (Planet)
            myViewHolder.planetName.setText(planet.getPlanetName());
            myViewHolder.moonCount.setText(planet.getMoonCount());
            myViewHolder.planetImg.setImageResource(planet.getPlanetImage());

            return result;
        }



}
