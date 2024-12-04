package com.example.nftartdisplay;

import android.app.Application;

import com.google.firebase.FirebaseApp;

/**
 * Class description:
 * Date: 2024/12/4
 *
 * @Author: wmmeng
 * @Description
 */
public class NFTApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
    }
}
