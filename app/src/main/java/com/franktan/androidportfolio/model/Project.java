package com.franktan.androidportfolio.model;

/**
 * Created by Frank Tan on 22/07/2015.
 */
public class Project {
    private String mName;
    private String mDescription;
    private int mImage;

    public Project(){}
    public Project (String name, String description, int image) {
        this.mName = name;
        this.mDescription = description;
        this.mImage = image;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public int getmImage() {
        return mImage;
    }

    public void setmImage(int mImage) {
        this.mImage = mImage;
    }
}
