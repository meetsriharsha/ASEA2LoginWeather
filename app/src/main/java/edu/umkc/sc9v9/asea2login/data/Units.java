package edu.umkc.sc9v9.asea2login.data;

import org.json.JSONObject;

/**
 * Created by meets on 2/2/2016.
 */
public class Units implements JSONPopulator {

    private String temperature;

    public String getTemperature() {
        return temperature;
    }

    @Override
    public void populate(JSONObject data) {

        temperature = data.optString("temperature");

    }
}
