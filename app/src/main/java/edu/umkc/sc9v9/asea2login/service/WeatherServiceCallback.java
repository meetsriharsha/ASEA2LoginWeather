package edu.umkc.sc9v9.asea2login.service;

import edu.umkc.sc9v9.asea2login.data.Channel;

/**
 * Created by meets on 2/2/2016.
 */
public interface WeatherServiceCallback {
    void serviceSuccess(Channel channel);
    void serviceFailure(Exception exception);
}
