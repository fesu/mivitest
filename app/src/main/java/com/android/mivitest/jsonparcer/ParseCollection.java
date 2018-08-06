package com.android.mivitest.jsonparcer;

import android.content.Context;

import com.android.mivitest.models.UserDetails;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Faisal on 04-08-2018.
 */

public class ParseCollection {
    Context context;

    public ParseCollection(Context context) {
        this.context = context;
    }

    public UserDetails getUserDetails(){
        Gson gson = new Gson();
        String strUserDetails = loadJSONFromAsset();
        return gson.fromJson(strUserDetails, UserDetails.class);
    }

    public String loadJSONFromAsset() {
        String json = null;
        try {
            InputStream is = context.getAssets().open("collection.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }
}
