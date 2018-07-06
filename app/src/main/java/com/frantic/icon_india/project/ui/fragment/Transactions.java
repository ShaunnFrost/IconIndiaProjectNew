package com.frantic.icon_india.project.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.frantic.icon_india.project.R;
import com.frantic.icon_india.project.adapter.TransactionAdapter;

/**
 * Created by Ankur_ on 5/12/2018.
 */

public class Transactions extends Fragment {

    private View view;

    private TextView tv_no_records;
    private RelativeLayout layout_no_records;
    RecyclerView rv_erec_erec;
    RecyclerView.Adapter rv_erec_erec_adapter;
    LinearLayoutManager rv_erec_erec_manager;
    boolean isProjects = false;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.transactions_layout,null);
        preparerecyclerView();
        return view;

    }
    public void preparerecyclerView(/*List<MyProjectsData> projectsRunning*/) {
        {
         /*   if(allLeaveRequests.size()>0) */{
            isProjects = true;
            rv_erec_erec = (RecyclerView) view.findViewById(R.id.fragment_frag__erection_rv__erection);
            rv_erec_erec_manager = new LinearLayoutManager(getActivity());
            rv_erec_erec.setLayoutManager(rv_erec_erec_manager);
            rv_erec_erec.setHasFixedSize(true);
            rv_erec_erec_adapter = new TransactionAdapter(getActivity(), Transactions.this);
            rv_erec_erec.setAdapter(rv_erec_erec_adapter);
            rv_erec_erec_adapter.notifyDataSetChanged();
        }/*
            else {
                layout_no_records.setVisibility(View.VISIBLE);
            }*/
        }
    }
}
