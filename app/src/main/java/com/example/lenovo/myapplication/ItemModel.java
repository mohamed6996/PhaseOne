package com.example.lenovo.myapplication;

/**
 * Created by lenovo on 10/20/2016.
 */

public class ItemModel {
    private int thumbnail, pop_up ;
    private String name , info ;

    public ItemModel( String name, String info, int thumbnail) {
        this.thumbnail = thumbnail;
        this.pop_up = pop_up;
        this.name = name;
        this.info = info;
    }

    public ItemModel() {
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public int getPop_up() {
        return pop_up;
    }

    public void setPop_up(int pop_up) {
        this.pop_up = pop_up;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
