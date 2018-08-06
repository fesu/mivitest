package com.android.mivitest.models;

import java.io.Serializable;

/**
 * Created by Faisal on 04-08-2018.
 */

public class Links {
    private String self;
    private String related;

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public String getRelated() {
        return related;
    }

    public void setRelated(String related) {
        this.related = related;
    }

    @Override
    public String toString() {
        return "Links{" +
                "self='" + self + '\'' +
                ", related='" + related + '\'' +
                '}';
    }
}
