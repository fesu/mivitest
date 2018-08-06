package com.android.mivitest.models;

import java.util.ArrayList;

/**
 * Created by Faisal on 04-08-2018.
 */

public class Subscriptions {
    private Links links;
    private ArrayList<Data> data;

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public ArrayList<Data> getData() {
        return data;
    }

    public void setData(ArrayList<Data> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Subscriptions{" +
                "links=" + links +
                ", data=" + data +
                '}';
    }
}
