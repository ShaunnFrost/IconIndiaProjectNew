package com.frantic.icon_india.project.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.frantic.icon_india.project.R;

/**
 * Created by Ankur_ on 5/12/2018.
 */

public class CustomAdapter extends BaseAdapter {


    Context context;
    int logos[];
    String text[];
    LayoutInflater inflter;
    private View view;
    private TextView gridText;
    private ImageView icon;

    public CustomAdapter(Context applicationContext, int[] logos, String[] text) {
        this.context = applicationContext;
        this.logos = logos;
        this.text=text;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return logos.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        view = inflter.inflate(R.layout.grid_view_layout, null);
       // inflate the layout
        icon = (ImageView) view.findViewById(R.id.grid_image);

        icon.setImageResource(logos[position]);

        gridText = (TextView) view.findViewById(R.id.grid_text);

        gridText.setText(text[position]);

        // set logo images
        return view;

    }
}
