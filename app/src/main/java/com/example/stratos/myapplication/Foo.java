package com.example.stratos.myapplication;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by pavlakis@workable.com on 2/1/16.
 */
public class Foo extends BaseObservable{

    private String bar;

    public Foo(String bar) {
        this.bar = bar;
    }

    @Bindable
    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar;
        notifyPropertyChanged(BR.bar);
    }
}
