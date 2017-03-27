package com.example.tenorio.simplechat;

import android.app.Application;

import com.parse.Parse;
import com.parse.interceptors.ParseLogInterceptor;

/**
 * Created by Tenorio on 3/26/17.
 */
public class ChatApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("myAppId") // should correspond to APP_ID env variable
                .clientKey("")
                .addNetworkInterceptor(new ParseLogInterceptor())
                .server("https://android-parse-app.herokuapp.com/parse/").build());

    }
}