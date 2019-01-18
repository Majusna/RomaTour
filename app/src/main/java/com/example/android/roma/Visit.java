package com.example.android.roma;

import android.widget.ImageView;
import android.widget.TextView;

public class Visit {

    private int mImageResource;
    private int mTitle;
    private int mDescription;

    public Visit(int imageResource, int title, int description) {

        mImageResource = imageResource;
        mTitle = title;
        mDescription = description;
    }

    public int getImageResource(){
        return mImageResource;
    }

    public int getTitle(){
        return mTitle;
    }

    public int getDescription(){
        return mDescription;
    }
}
