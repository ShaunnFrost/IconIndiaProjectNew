package com.frantic.icon_india.project.Services;

import android.util.Log;

import com.frantic.icon_india.project.network.Network;
import com.frantic.icon_india.project.sharedprefrences.SharedPrefrences;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Ankur_ on 3/14/2018.
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {


    private String deviceId;
    private SharedPrefrences sharedPrefrences;
    private Network network;

    @Override
    public void onTokenRefresh() {
        deviceId = FirebaseInstanceId.getInstance().getToken();
        Log.e("Token", "Refreshed token: " + deviceId);
        // TODO: Implement this method to send any registration to your app's servers i.e send this token to php or asp.net end so that they can send message to particular device based on this registration token.This token is regenerated when new app is installed or app cache or data is cleared.
        sharedPrefrences = SharedPrefrences.getsharedprefInstance(getApplicationContext());
        network = Network.getInstance(getApplicationContext());
        sharedPrefrences.setFCMDeviceId(deviceId);
        Log.e("deviceId", deviceId +"");
    }

}
