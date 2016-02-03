package com.example.stratos.myapplication;

import android.app.Application;

/**
 * Created by pavlakis@workable.com on 2/1/16.
 */
public class MyApplication extends Application {

    private ApplicationComponent component;

    @Override public void onCreate() {
        super.onCreate();
        component = DaggerApplicationComponent
                .builder()
                .androidModule(new AndroidModule(this))
                .build();
    }

    public ApplicationComponent component() {
        return component;
    }

}
