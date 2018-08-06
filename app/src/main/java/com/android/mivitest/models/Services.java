package com.android.mivitest.models;

/**
 * Created by Faisal on 04-08-2018.
 */

public class Services {
    private Links links;

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    @Override
    public String toString() {
        return "Services{" +
                "links=" + links +
                '}';
    }
}
