package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class detail extends AppCompatActivity {

    ImageView imgBack,imgTozihat;
    TextView txtTitle,txtReshteh,txtPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imgTozihat = findViewById(R.id.img_tozihat);
        imgBack=findViewById(R.id.img_back_tozihat);
        txtTitle = findViewById(R.id.title_book_detail);
        txtReshteh = findViewById(R.id.reshte_detail);
        txtPrice = findViewById(R.id.price_detail);

        Bundle bundle = getIntent().getExtras();
        txtTitle.setText(bundle.getString("title_book"));
        txtReshteh.setText(bundle.getString("reshte"));
        txtPrice.setText(bundle.getString("price_book"));
        imgTozihat.setImageResource(bundle.getInt("image_book"));

    }
}