package com.awashingcompany.wewash.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.awashingcompany.wewash.Fragments.NearMeFragment;
import com.awashingcompany.wewash.Models.MainActivityLabels;
import com.awashingcompany.wewash.R;

import java.util.List;

public class MainActivityLabelAdapter extends RecyclerView.Adapter<MainActivityLabelAdapter.MyViewHolder> {



    private List<MainActivityLabels> labelImagesList;
    Context context;

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_mainactivity_label, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        MainActivityLabels labels = labelImagesList.get(position);
        holder.labelImage.setImageResource(R.drawable.ic_location_on_black_24dp);
    }




    @Override
    public int getItemCount() {
        return labelImagesList.size();
    }



    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView labelImage;
        public MyViewHolder(View view) {
            super(view);
            labelImage = view.findViewById(R.id.labels);
        }
    }


    public MainActivityLabelAdapter(List<MainActivityLabels> labelImagesList, Context context) {
        this.labelImagesList = labelImagesList;
        this.context = context;
    }

}
