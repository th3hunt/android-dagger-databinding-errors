package com.example.stratos.myapplication;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


@Module
public class AndroidModule {

    private Application application;

    public AndroidModule(Application application) {
        this.application = application;
    }

    @Provides
    public Foo providesFoo(String bar) {
        return new Foo(bar);
    }

//    @Provides
//    public Foo providesFoo2(String bar, String unusedArgument) {
//        return new Foo(bar);
//    }

    @Provides
    @Singleton
    @ForApplication
    Context provideApplicationContext() {
        return this.application;
    }

}
