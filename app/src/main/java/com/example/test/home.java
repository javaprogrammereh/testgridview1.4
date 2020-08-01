package com.example.test;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class home extends Fragment {

    CardView omumi, takhasosi, maqalat;

    public home() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        omumi = rootView.findViewById(R.id.omumi);
        takhasosi = rootView.findViewById(R.id.takhasosi);
        maqalat = rootView.findViewById(R.id.maqalat);

        omumi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                general.value="omumi";
                Intent intent = new Intent(getActivity(), general.class);
                startActivity(intent);
            }
        });
        takhasosi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                general.value="takhasosi";
                Intent intent1 = new Intent(getActivity(), general.class);
                startActivity(intent1);
            }
        });
        maqalat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                general.value="maqalat";
                Intent intent2 = new Intent(getActivity(), general.class);
                startActivity(intent2);
            }
        });
        return rootView;

    }
}