package com.example.stratos.myapplication;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by pavlakis@workable.com on 2/1/16.
 */
public class MyApplication extends Application {

    @Singleton
    @Component(modules = AndroidModule.class)
    public interface ApplicationComponent {
        void inject(MainActivity activity);
    }

    private ApplicationComponent component;

    @Override public void onCreate() {
        super.onCreate();
        component = DaggerMyApplication_ApplicationComponent.builder()
                .androidModule(new AndroidModule(this))
                .build();
    }

    public ApplicationComponent component() {
        return component;
    }

}
