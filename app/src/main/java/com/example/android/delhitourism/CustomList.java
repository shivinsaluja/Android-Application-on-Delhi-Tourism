package com.example.android.delhitourism;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

/**
 * Created by SHIVIN SALUJA on 02-05-2017.
 */


    public class CustomList extends ArrayAdapter<String> {

        private final Activity context;
        private final Integer[] imageId;
        public CustomList(Activity context,Integer[] imageId) {
            super(context, R.layout.activity_list_main);
            this.context = context;
            this.imageId = imageId;

        }
        @Override
        public View getView(int position, View view, ViewGroup parent) {
            LayoutInflater inflater = context.getLayoutInflater();
            View rowView= inflater.inflate(R.layout.activity_list_main, null, true);
            //TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);
            ImageView imageView = (ImageView) rowView.findViewById(R.id.listmainactivityimage);
            //txtTitle.setText(web[position]);

            imageView.setImageResource(imageId[position]);
            return rowView;
        }
    }

