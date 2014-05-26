package com.example.gowhere.app;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/**
 * Created by Darius on 26/05/2014.
 */
public class MainLocationListener implements LocationListener {

    Location mLocation;

    public Location getLocation() {
        return mLocation;
    }

    public void setLocation(Location location) {
        mLocation = location;
    }

    public void onLocationChanged(final Location location) {
        mLocation = location;
    }

    public void onStatusChanged(String provider, int status, Bundle extras) {}

    public void onProviderEnabled(String provider) {}

    public void onProviderDisabled(String provider) {}

}
