package com.example.stratos.myapplication;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by pavlakis@workable.com on 2/1/16.
 */
@Module
public class AnotherModule {

    public AnotherModule() {
    }

    @Provides
    @Singleton
    public Dog providesDog() {
        return new Dog();
    }

//    @Provides
//    @Singleton
//    public Dog providesDog2(String name) {
//        return new Dog();
//    }

}
