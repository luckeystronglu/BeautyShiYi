package com.best.entity;

/**
 * Created by lenovo on 2016/10/13.
 */
public class BannerItem {
    private int image;
    private String title;

    public BannerItem() {
    }

    public BannerItem(int image, String title) {
        this.image = image;
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
