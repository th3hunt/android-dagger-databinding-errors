package com.example.stratos.myapplication;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by pavlakis@workable.com on 2/1/16.
 */
@Singleton
@Component(modules = {AndroidModule.class})
public interface ApplicationComponent {

    AnotherComponent getAnotherComponent(AnotherModule module);

}
