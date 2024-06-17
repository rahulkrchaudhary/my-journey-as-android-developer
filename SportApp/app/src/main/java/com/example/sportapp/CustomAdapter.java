package com.example.sportapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.SportViewHolder> {

    private List<Sport> sportList;

    public CustomAdapter(List<Sport> sportList) {
        this.sportList = sportList;
    }

    @NonNull
    @Override
    public SportViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inflating the layout for each item in the recycleview

        View itemView= LayoutInflater.from(parent.getContext())
                .inflate(
                        R.layout.card_item_layout,
                        parent,
                        false
                );


        return new SportViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SportViewHolder holder,
                                 int position) {
        //called for each item in the list and is responsible for
        //binding the data from the sport object to the view
        //within the SportsViewHolder

        Sport sport=sportList.get(position);
        holder.textView.setText(sport.sportName);
        holder.imageView.setImageResource(sport.sportImg);
    }

    @Override
    public int getItemCount() {
        return sportList.size();
    }


    public static class SportViewHolder extends RecyclerView.ViewHolder{
        //holdw the references to the views within the item layout
        TextView textView;
        ImageView imageView;


        public SportViewHolder(@NonNull View itemView) {
            super(itemView);

            textView=itemView.findViewById(R.id.textView);
            imageView=itemView.findViewById(R.id.imageviewcard);
        }
    }

}
