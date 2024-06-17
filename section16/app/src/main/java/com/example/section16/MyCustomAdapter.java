package com.example.section16;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyCustomAdapter extends BaseAdapter {
    private Context context;
    private String[] items;

    public MyCustomAdapter(Context context, String[] items) {
        this.context = context;
        this.items = items;
    }

    @Override
    //return number of item in ur data source;
    public int getCount() {
        return items.length;
    }

    @Override
    //return data item at specific given position
    public Object getItem(int position) {
        return items[position];
    }

    @Override
    // return the unique id for item at the given position
    public long getItemId(int position) {
        return position;
    }

    @Override
    //display the dtaa at a position in the data set
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null){
            // convertview is a recycled view that u can reuse
            // to improve the performance of your list
            convertView = LayoutInflater.from(context).
                    inflate(R.layout.my_list_item, parent, false);
            holder = new ViewHolder();
            holder.textView=convertView.findViewById(R.id.text1);
            convertView.setTag(holder);
        } else {
            // reusing the view (that's recycled)
            holder =  (ViewHolder) convertView.getTag();
        }

        // set data to view
        holder.textView.setText(items[position]);

        //binding data to views within the convertview
        return convertView; //display the data at a position in the data set
    }

    static class ViewHolder{
        //hold references to the view within an item layout
        TextView textView;

    }

}
