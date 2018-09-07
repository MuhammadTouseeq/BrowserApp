package com.andev.browser;

import java.util.ArrayList;

/**
 * Created by Engeneer Touseeq on 9/5/2018.
 */

public class PageHolder {

    private static PageHolder pageHolder=new PageHolder();
    public static PageHolder getInstance() {
        return pageHolder;
    }



     ArrayList<Page> arrLoadedURL=new ArrayList<>();


    public ArrayList<Page> getArrLoadedURL() {
        return arrLoadedURL;
    }


    public void clearCache()
    {
        arrLoadedURL.clear();
    }
    public void addPage(Page webView)
    {
        arrLoadedURL.add(webView);
    }

}
