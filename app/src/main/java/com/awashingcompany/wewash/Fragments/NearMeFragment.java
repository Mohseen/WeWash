package com.awashingcompany.wewash.Fragments;


import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.awashingcompany.wewash.Adapters.MainActivityLabelAdapter;
import com.awashingcompany.wewash.Models.MainActivityLabels;
import com.awashingcompany.wewash.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class NearMeFragment extends Fragment {

    RecyclerView recyclerView;
    private MainActivityLabelAdapter mAdapter;
    private List<MainActivityLabels> labelsList = new ArrayList<>();
    Context context;

    public static NearMeFragment newInstance() {
        NearMeFragment fragment = new NearMeFragment();
        return fragment;
    }

    public  NearMeFragment(){ }//Default fragment

    @SuppressLint("ValidFragment")
    public NearMeFragment(Context context) {
        this.context = context;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_near_me, container, false);
        recyclerView = (RecyclerView)view.findViewById(R.id.recyclerviewMainActivity);

        loadLabels();
        return view;
    }


    private void loadLabels() {
        labelsList.add(new MainActivityLabels("hello"));
        labelsList.add(new MainActivityLabels("hello1"));
        labelsList.add(new MainActivityLabels("hello2"));
        labelsList.add(new MainActivityLabels("hello3"));

        mAdapter = new MainActivityLabelAdapter(labelsList, context);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();
    }
}
