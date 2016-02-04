package edu.umkc.sc9v9.asea2login.data;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by meets on 2/2/2016.
 */
public class Condition implements JSONPopulator {

    private int code;
    private String temperature;
    private String description;

    public int getCode() {
        return code;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public void populate(JSONObject data) {

        code = data.optInt("code");
        temperature = data.optString("temp");
        description = data.optString("text");
    }

/*    public JSONObject toJSON() {
        JSONObject data = new JSONObject();

        try {
            data.put("code", code);
            data.put("temp", temperature);
            data.put("text", description);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return data;
    }*/
}
