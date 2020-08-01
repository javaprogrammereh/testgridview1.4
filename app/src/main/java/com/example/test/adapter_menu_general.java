package com.example.test;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import java.util.ArrayList;

public class adapter_menu_general extends ArrayAdapter {
    public int resourceId;
    public Activity activity;
    public ArrayList<item_model_menu_general> data;

    public adapter_menu_general(Activity activity, int resourceId, ArrayList<item_model_menu_general> object) {
        super(activity, resourceId, object);
        this.resourceId = resourceId;
        this.activity = activity;
        this.data = object;
    }
    @Override
    public View getView(final int position, View view, ViewGroup viewGroup) {
        View grid;
        LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (view == null) {
            grid = inflater.inflate(R.layout.item_grid_menu_general, null);
            CardView cardView = grid.findViewById(R.id.grid_menu_general);
            TextView textViewName = grid.findViewById(R.id.txt_name_item_menu);
            TextView textViewReshte = grid.findViewById(R.id.txt_reshte_item_menu);
            TextView textViewPrice = grid.findViewById(R.id.txt_price_item_menu);
            ImageView imageView = grid.findViewById(R.id.img_item_menu);
            item_model_menu_general item_model_menu_general = new item_model_menu_general();
            item_model_menu_general = data.get(position);
            textViewName.setText(item_model_menu_general.getuName());
            textViewReshte.setText(item_model_menu_general.getuReshte());
            textViewPrice.setText(item_model_menu_general.getuPrice());
            imageView.setImageResource(item_model_menu_general.getuAvatar());

            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                        Intent intent  = new Intent(activity, detail.class);
                        intent.putExtra("title_book",data.get(position).getuName());
                        intent.putExtra("image_book",data.get(position).getuAvatar());
                        intent.putExtra("reshte",data.get(position).getuReshte());
                        intent.putExtra("price_book",data.get(position).getuPrice());
                        activity.startActivity(intent);

                }
            });
        } else {
            grid = view;
        }
        return grid;
    }
}

