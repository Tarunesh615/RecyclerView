package com.example.recyclerview;

import android.widget.ImageView;

public class ListData {
    private String title,detail;
    private  int im;

    public ListData(String title,String detail,int im){
        this.title=title;
        this.detail=detail;
        this.im=im;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIm() {
        return im;
    }

    public void setIm(int im) {
        this.im = im;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail=detail;

    }
}
