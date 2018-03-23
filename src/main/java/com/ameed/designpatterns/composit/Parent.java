package com.ameed.designpatterns.composit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ameed_fah
 * 22/03/2018
 */
public class Parent extends Person {
    private List<Person> children;

    public Parent(String name) {
        super(name);
        this.children = new ArrayList<>();
    }

    public void sayName(int spaces) {
        print(super.name, spaces);
        if (!this.children.isEmpty()) {
            for (Person child : children) {
                child.sayName(spaces + 1);
            }
        }
    }

    public void addChild(Person person) {
        this.children.add(person);
    }
}
