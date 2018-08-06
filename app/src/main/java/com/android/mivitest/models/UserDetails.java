package com.android.mivitest.models;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import java.util.ArrayList;

/**
 * Created by Faisal on 04-08-2018.
 */

public class UserDetails extends BaseObservable {
    private Data data;
    private ArrayList<Included> included;

    @Bindable
    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public ArrayList<Included> getIncluded() {
        return included;
    }

    public void setIncluded(ArrayList<Included> included) {
        this.included = included;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "data=" + data +
                ", included=" + included +
                '}';
    }
}
