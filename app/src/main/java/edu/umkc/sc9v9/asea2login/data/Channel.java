package edu.umkc.sc9v9.asea2login.data;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by meets on 2/2/2016.
 */
public class Channel implements JSONPopulator {
    private Item item;
    private Units units;
    private String location;
    public Item getItem() {
        return item;
    }

    public Units getUnits() {

        return units;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public void populate(JSONObject data) {

        units = new Units();
        units.populate(data.optJSONObject("units"));

        item = new Item();
        item.populate(data.optJSONObject("item"));

        JSONObject locationData = data.optJSONObject("location");

        String region = locationData.optString("region");
        String country = locationData.optString("country");

        location = String.format("%s, %s", locationData.optString("city"), (region.length() != 0 ? region : country));
    }

   /* @Override
    public JSONObject toJSON() {

        JSONObject data = new JSONObject();

        try {
            data.put("units", units.toJSON());
            data.put("item", item.toJSON());
            data.put("requestLocation", location);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return data;
    }*/
}
