package com.example.henrique.simpletodolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter<String>
{

    Context context;
    String[] title;


    public CustomAdapter(Context context, String[] titles)
    {

        super(context, R.layout.single_row,titles);

        this.context=context;
        this.title=titles;


    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View row=inflater.inflate(R.layout.single_row, parent, false);
        TextView mytitle= (TextView) row.findViewById(R.id.textView);
        mytitle.setText(title[position]);

        return row;


    }
}