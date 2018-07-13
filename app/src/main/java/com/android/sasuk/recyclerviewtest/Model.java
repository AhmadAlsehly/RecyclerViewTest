package com.android.sasuk.recyclerviewtest;

import android.widget.ImageView;

public class Model {
    private String name;
    private String disc;
    private int image;


    public Model(String name, String disc, int image) {
        this.name = name;
        this.disc = disc;
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDisc(String disc) {
        this.disc = disc;
    }

    public String getName() {
        return name;
    }

    public String getDisc() {
        return disc;
    }
}
