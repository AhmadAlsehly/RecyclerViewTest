package com.android.sasuk.recyclerviewtest;

public class Model {
    private String name;
    private String disc;

    public Model(String name, String disc) {
        this.name = name;
        this.disc = disc;
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
