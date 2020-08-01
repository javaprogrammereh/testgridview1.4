package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class general extends AppCompatActivity {

    TextView txtTitle;
    GridView gridView;
    public static String titleMenu;
    public ArrayList<item_model_menu_general> listomumi, listtakhasosi, listmaqalat;
    public static String value;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general);

        txtTitle = findViewById(R.id.title_general);
        gridView = findViewById(R.id.grid_menu);

        if (value.contains("omumi")) {
            txtTitle.setText("دروس عمومی");
            setOmumi();
            adapter_menu_general adapter = new adapter_menu_general(general.this, R.layout.item_grid_menu_general, listomumi);
            gridView.setAdapter(adapter);
        } else if (value.contains("takhasosi")) {
            txtTitle.setText("دروس تخصصی");
            setTakhasosi();
            adapter_menu_general adapter = new adapter_menu_general(general.this, R.layout.item_grid_menu_general, listtakhasosi);
            gridView.setAdapter(adapter);

        } else if (value.contains("maqalat")) {
            txtTitle.setText("مقالات");
            setMaqalat();
            adapter_menu_general adapter = new adapter_menu_general(general.this, R.layout.item_grid_menu_general, listmaqalat);
            gridView.setAdapter(adapter);
        }
    }

    private void setMaqalat() {
        listmaqalat = new ArrayList<>();
        listmaqalat.add(new item_model_menu_general(R.drawable.test3,
                "درس شبکه های اینترنتی",
                "مهندسی نرم افزار",
                "3500"));
        listmaqalat.add(new item_model_menu_general(R.drawable.test3,
                "درس شبکه های اینترنتی",
                "مهندسی نرم افزار",
                "3500"));
    }

    private void setTakhasosi() {
        listtakhasosi = new ArrayList<>();
        listtakhasosi.add(new item_model_menu_general(R.drawable.test2,
                "درس شبکه های اینترنتی",
                "مهندسی نرم افزار",
                "3500"));
        listtakhasosi.add(new item_model_menu_general(R.drawable.test2,
                "درس شبکه های اینترنتی",
                "مهندسی نرم افزار",
                "3500"));
    }

    private void setOmumi() {
        listomumi = new ArrayList<>();
        listomumi.add(new item_model_menu_general(R.drawable.test,
                "درس شبکه های اینترنتی",
                "مهندسی نرم افزار",
                "3500"));
        listomumi.add(new item_model_menu_general(R.drawable.test,
                "درس شبکه های اینترنتی",
                "مهندسی نرم افزار",
                "3500"));
        listomumi.add(new item_model_menu_general(R.drawable.test,
                "درس شبکه های اینترنتی",
                "مهندسی نرم افزار",
                "3500"));
        listomumi.add(new item_model_menu_general(R.drawable.test,
                "درس شبکه های اینترنتی",
                "مهندسی نرم افزار",
                "3500"));
        listomumi.add(new item_model_menu_general(R.drawable.test,
                "درس شبکه های اینترنتی",
                "مهندسی نرم افزار",
                "3500"));
        listomumi.add(new item_model_menu_general(R.drawable.test,
                "درس شبکه های اینترنتی",
                "مهندسی نرم افزار",
                "3500"));
        listomumi.add(new item_model_menu_general(R.drawable.test,
                "درس شبکه های اینترنتی",
                "مهندسی نرم افزار",
                "3500"));
        listomumi.add(new item_model_menu_general(R.drawable.test,
                "درس شبکه های اینترنتی",
                "مهندسی نرم افزار",
                "3500"));
        listomumi.add(new item_model_menu_general(R.drawable.test,
                "درس شبکه های اینترنتی",
                "مهندسی نرم افزار",
                "3500"));
        listomumi.add(new item_model_menu_general(R.drawable.test,
                "درس شبکه های اینترنتی",
                "مهندسی نرم افزار",
                "3500"));
    }

}