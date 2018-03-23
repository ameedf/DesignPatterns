package com.ameed.designpatterns.composit;

/**
 * Created by ameed_fah
 * 22/03/2018
 */
public class PersonWithoutFamily extends Person {
    public PersonWithoutFamily(String name) {
        super(name);
    }

    @Override
    public void sayName(int spaces) {
        print(name, spaces);
    }
}
