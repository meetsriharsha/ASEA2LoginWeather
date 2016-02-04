package edu.umkc.sc9v9.asea2login.data;

import org.json.JSONObject;

/**
 * Created by meets on 2/2/2016.
 */
public class Item implements JSONPopulator {

    private Condition condition;

    public Condition getCondition() {
        return condition;
    }

    @Override
    public void populate(JSONObject data) {

        condition = new Condition();
        condition.populate(data.optJSONObject("condition"));

    }


}
