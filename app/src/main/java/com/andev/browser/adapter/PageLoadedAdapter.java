package com.andev.browser.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.andev.browser.Page;
import com.andev.browser.R;

import java.util.ArrayList;

public class PageLoadedAdapter extends ArrayAdapter<Page> {

    ArrayList<Page> List = new ArrayList<>();

    public PageLoadedAdapter(Context context, int textViewResourceId, ArrayList<Page> objects) {
        super(context, textViewResourceId, objects);
        List = objects;
    }

    public boolean isBackStack;

    public boolean isBackStack() {
        return isBackStack;
    }

    public void setBackStack(boolean backStack) {
        isBackStack = backStack;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.list_view_items, null);
        TextView textView = (TextView) v.findViewById(R.id.textView);
        ImageView imageView = (ImageView) v.findViewById(R.id.imageView);
        textView.setText(List.get(position).getName());
imageView.setVisibility(View.GONE);
//        if(position+1<List.size())
//        {
//            imageView.setImageBitmap(List.get(position+1).getBitmap());
//        }
//        else {
//            imageView.setImageDrawable(getContext().getResources().getDrawable(R.mipmap.icn_google));
//        }

            return v;

    }

}

//package example.abhiandriod.customarrayadapterexample;
//
//

