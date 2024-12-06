package com.example.nftartdisplay;

import android.app.Application;

import com.google.firebase.FirebaseApp;

/**
 * Class description:
 * @Description
 */
public class NFTApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
    }
}
