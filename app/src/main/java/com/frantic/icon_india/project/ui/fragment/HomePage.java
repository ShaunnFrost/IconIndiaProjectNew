package com.frantic.icon_india.project.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.frantic.icon_india.project.R;
import com.frantic.icon_india.project.adapter.CustomAdapter;

/**
 * Created by Ankur_ on 5/12/2018.
 */

public class HomePage extends Fragment {

    private View view;
    int logos[] = {R.drawable.login__bg, R.drawable.logo, R.drawable.logo_udaan, R.drawable.dash_help,
            R.drawable.approve_icon, R.drawable.bell_icon, R.drawable.bg};

    String text[] = {"one","two","three","four",
            "five","six","seven"};


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.main_home_dashboard,null);

        GridView simpleGrid = (GridView)view.findViewById(R.id.simpleGridView); // init GridView
        // Create an object of CustomAdapter and set Adapter to GirdView

        CustomAdapter customAdapter = new CustomAdapter(getActivity(), logos,text);
        simpleGrid.setAdapter(customAdapter);
        // implement setOnItemClickListener event on GridView

        simpleGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // set an Intent to Another Activity

                /*Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("image", logos[position]); // put image data in Intent
                startActivity(intent); // start Intent*/
            }
        });

        return view;





    }
}
