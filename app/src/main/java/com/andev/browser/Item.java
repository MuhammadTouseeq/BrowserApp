package com.andev.browser;

import android.graphics.Bitmap;

public class Item {

    String ItemName;
    int ItemImage;
    Bitmap mBitmap;

    public Item(String Name, int Image) {
        this.ItemImage = Image;
        this.ItemName = Name;
    }

    public String getItemName() {
        return ItemName;
    }

    public int getItemImage() {
        return ItemImage;
    }

    public Bitmap getBitmap() {
        return mBitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        mBitmap = bitmap;
    }
}