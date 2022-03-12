package com.example.parstagram;

import android.app.Application;
import android.view.View;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // register parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("ZB8fuCFit6cc4JAovmKGJQuxgvlhQbVt5c7yFXWf")
                .clientKey("DNXBkiiuygOpJfj0asWYyPSCBJAdCqrBqEY5o8U0")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
