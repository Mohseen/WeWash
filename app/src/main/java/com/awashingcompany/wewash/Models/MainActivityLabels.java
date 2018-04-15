package com.awashingcompany.wewash.Models;

import android.widget.ImageView;

public class MainActivityLabels {

    String labelImageURL;

    public  MainActivityLabels(String labelImageURL){
        this.labelImageURL = labelImageURL;
    }

    public String getLabelImageURL() {
        return labelImageURL;
    }

    public void setLabelImageURL(String labelImageURL) {
        this.labelImageURL = labelImageURL;
    }
}
