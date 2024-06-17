package com.example.volumecalculator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyCustomAdapter extends ArrayAdapter<Shape> {

    private ArrayList<Shape> shapeArrayList;
    Context context;

    public MyCustomAdapter(ArrayList<Shape> shapeArrayList, Context context) {
        super(context, R.layout.grid_layout, shapeArrayList);
        this.shapeArrayList = shapeArrayList;
        this.context = context;
    }

    private static class MyViewHolder{
        TextView shapeName;
        ImageView shapeImg;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Shape shape=getItem(position);
        MyViewHolder myViewHolder;
        final View result;
        if(convertView==null){
            // no view went off-screen --> create a new view
            myViewHolder= new MyViewHolder();
            LayoutInflater inflater= LayoutInflater.from(getContext());
            convertView=inflater.inflate(
                    R.layout.grid_layout,
                    parent,
                    false);
            //finding the view
            myViewHolder.shapeName=(TextView) convertView.findViewById(R.id.text);
            myViewHolder.shapeImg=(ImageView) convertView.findViewById(R.id.image);
            result=convertView;
            convertView.setTag(myViewHolder);

        }else{
            // a view went off-screen --> reuse it
            myViewHolder=(MyViewHolder) convertView.getTag();
            result=convertView;
        }
        myViewHolder.shapeName.setText(shape.getShapeName());
        myViewHolder.shapeImg.setImageResource(shape.getShapeImg());

         return result;

    }
}
