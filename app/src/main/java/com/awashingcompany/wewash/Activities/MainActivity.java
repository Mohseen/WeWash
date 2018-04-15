package com.awashingcompany.wewash.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.awashingcompany.wewash.Adapters.MainActivityLabelAdapter;
import com.awashingcompany.wewash.Models.MainActivityLabels;
import com.awashingcompany.wewash.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    RecyclerView recyclerView;
    private MainActivityLabelAdapter mAdapter;

    private List<MainActivityLabels> labelsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        applyFont(MainActivity.this,findViewById(R.id.baselayout_mainactivity));


        recyclerView = (RecyclerView)findViewById(R.id.recyclerviewMainActivity);

        loadLabels();
    }

    private void loadLabels() {
        labelsList.add(new MainActivityLabels("hello"));
        labelsList.add(new MainActivityLabels("hello1"));
        labelsList.add(new MainActivityLabels("hello2"));
        labelsList.add(new MainActivityLabels("hello3"));

        mAdapter = new MainActivityLabelAdapter(labelsList,MainActivity.this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(MainActivity.this.getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();
    }
}
