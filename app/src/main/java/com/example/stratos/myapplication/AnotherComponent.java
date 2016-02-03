package com.example.stratos.myapplication;

import javax.inject.Singleton;

import dagger.Subcomponent;

/**
 * Created by pavlakis@workable.com on 2/1/16.
 */
@Subcomponent(modules={AnotherModule.class})
@Singleton
public interface AnotherComponent {

    void inject(MainActivity activity);

}
