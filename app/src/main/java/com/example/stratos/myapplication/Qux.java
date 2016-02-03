package com.example.stratos.myapplication;

import javax.inject.Inject;

/**
 * Created by pavlakis@workable.com on 2/1/16.
 */
public class Qux {

    Dog dog;

    @Inject
    public Qux(Dog dog) {
        this.dog = dog;
    }
}
