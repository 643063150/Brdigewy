package com.zpp.mygraffiti.graffiti;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by 飞侠 on 2017/8/9.
 */

public class ScreenAdapter extends BaseAdapter {
    ArrayList<HashMap<String,String>> arrayList;
    Context context;
    public ScreenAdapter(Context context, ArrayList<HashMap<String,String>> arrayList){
        this.arrayList=arrayList;
        this.context=context;

    }
    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView= LayoutInflater.from(context).inflate(R.layout.screen_items,null);
        TextView textView=(TextView)convertView.findViewById(R.id.txt);
        textView.setText(arrayList.get(position).get("name"));
        return convertView;
    }
}
