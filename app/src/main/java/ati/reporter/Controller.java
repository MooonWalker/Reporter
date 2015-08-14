package ati.reporter;

import android.location.Location;
import android.location.LocationManager;


public class Controller
{

    public static Location getLocation()
    {
        return MainActivity.lm.getLastKnownLocation(LocationManager.GPS_PROVIDER);
    }
}
