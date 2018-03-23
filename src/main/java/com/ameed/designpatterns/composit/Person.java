package com.ameed.designpatterns.composit;

/**
 * Created by ameed_fah
 * 22/03/2018
 */
abstract public class Person {
    protected final String name;

    protected Person(String name) {
        this.name = name;
    }

    abstract public void sayName(int spaces);

    // helper method to print some spaces before a string
    protected void print(String s, int spaces) {
        for (int i = 0; i < spaces * 2; i++) {
            s = "- " + s;
        }
        System.out.println(s);
    }
}
