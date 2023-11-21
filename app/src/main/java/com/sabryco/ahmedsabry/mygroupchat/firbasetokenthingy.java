package com.sabryco.ahmedsabry.mygroupchat;

import android.util.Log;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Ahmed Sabry on 8/7/2017.
 */

public class firbasetokenthingy extends FirebaseInstanceIdService {

    private static final String REG_TOKEN = "REG_TOKEN";

    @Override
    public void onTokenRefresh(){


        String token = FirebaseInstanceId.getInstance().getToken();
        Log.d(REG_TOKEN, token);

    }
}
