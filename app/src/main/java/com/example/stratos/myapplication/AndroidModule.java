package com.example.stratos.myapplication;

import android.app.Application;

import javax.inject.Named;

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

    @Provides
    @Named("glool")
    public Foo providesFoo(String bar, String unusedArgument) {
        return new Foo(bar);
    }

}
