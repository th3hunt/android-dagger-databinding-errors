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

        void inject(MainActivity2 activity);

        void inject(MainActivity3 activity);

        void inject(MainActivity4 activity);

        void inject(MainActivity5 activity);

        void inject(MainActivity6 activity);

        void inject(MainActivity7 activity);

        void inject(MainActivity8 activity);

        void inject(MainActivity9 activity);

        void inject(MainActivity10 activity);

        void inject(MainActivity11 activity);

        void inject(MainActivity12 activity);

        void inject(MainActivity13 activity);

        void inject(MainActivity14 activity);

        void inject(MainActivity15 activity);

        void inject(MainActivity16 activity);

        void inject(MainActivity17 activity);

        void inject(MainActivity18 activity);

        void inject(MainActivity19 activity);

        void inject(MainActivity20 activity);

        void inject(MainActivity21 activity);

        void inject(MainActivity22 activity);

        void inject(MainActivity23 activity);

        void inject(MainActivity24 activity);

        void inject(MainActivity25 activity);

        void inject(MainActivity26 activity);

        void inject(MainActivity27 activity);

        void inject(MainActivity28 activity);

        void inject(MainActivity29 activity);

        void inject(MainActivity30 activity);
    }

    private static ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerMyApplication_ApplicationComponent.builder()
                .androidModule(new AndroidModule(this))
                .build();
    }

    public static ApplicationComponent component() {
        return component;
    }


}
