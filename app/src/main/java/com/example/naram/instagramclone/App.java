package com.example.naram.instagramclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("rcm6G0FAmt3RrFrCGeO8EaGXpWaVkqlYdzB7FdrI")
                // if defined
                .clientKey("C4g99PjStyn4Uor9vdEMPZfLEQdl7rXnmQQxjxFe")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }
}
