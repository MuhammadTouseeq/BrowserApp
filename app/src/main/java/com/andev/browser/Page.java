package com.andev.browser;

import android.graphics.Bitmap;

/**
 * Created by Engeneer Touseeq on 9/5/2018.
 */

public class Page {

    private String url;
    private String name;
    private Bitmap mBitmap;

    public Page(String url, String name, Bitmap bitmap) {
        this.url = url;
        this.name = name;
        mBitmap = bitmap;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bitmap getBitmap() {
        return mBitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        mBitmap = bitmap;
    }
}
