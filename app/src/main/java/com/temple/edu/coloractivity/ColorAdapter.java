package com.temple.edu.coloractivity;

import android.app.Activity;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

class ColorAdapter extends BaseAdapter {
    private ArrayList<String> list;
    private Activity activity;
    public ColorAdapter(ArrayList<String> list, ColorActivity colorActivity) {
        this.list = list;
        this.activity = colorActivity;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView view = new TextView(activity.getApplicationContext());
        view.setId(position);
        view.setText(list.get(position));

        if(position != 0){
            view.setBackgroundColor(Color.parseColor(list.get(position)));
        }
        return view;
    }
}
