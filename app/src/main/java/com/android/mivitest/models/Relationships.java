package com.android.mivitest.models;

import java.io.Serializable;

/**
 * Created by Faisal on 04-08-2018.
 */

public class Relationships {
    private Services services;
    private Subscriptions subscriptions;

    public Subscriptions getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(Subscriptions subscriptions) {
        this.subscriptions = subscriptions;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    @Override
    public String toString() {
        return "Relationships{" +
                "services=" + services +
                ", subscriptions=" + subscriptions +
                '}';
    }
}
