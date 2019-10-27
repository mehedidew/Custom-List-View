package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Adaptar extends BaseAdapter {
    Context mcontext;
    List<Model>list=new ArrayList<Model>();

    public Adaptar(Context mcontext, List<Model> list) {
        this.mcontext = mcontext;
        this.list = list;
    }
    @Override
    public int getCount() {
        return list.size();
    }
    @Override
    public Object getItem(int position) {
        return position;
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView= LayoutInflater.from(mcontext).inflate(R.layout.single_list_item_1,parent,false);
        TextView name= convertView.findViewById(R.id.name);
        TextView email=convertView.findViewById(R.id.email);

        name.setText(list.get(position).getName());
        email.setText(list.get(position).getEmail());
        return convertView;
    }
}
