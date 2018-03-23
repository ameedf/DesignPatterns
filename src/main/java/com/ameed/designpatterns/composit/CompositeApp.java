package com.ameed.designpatterns.composit;

/**
 * Created by ameed_fah
 * 22/03/2018
 */
public class CompositeApp {
    public static void main(String[] args) {
        Parent a = new Parent("a");
        PersonWithoutFamily b = new PersonWithoutFamily("b");
        a.addChild(b);
        a.addChild(new PersonWithoutFamily("c"));

        Parent d = new Parent("d");
        a.addChild(d);
        d.addChild(new PersonWithoutFamily("e"));
        Parent h = new Parent("h");
        d.addChild(h);
        h.addChild(new PersonWithoutFamily("i"));
        h.addChild(new PersonWithoutFamily("j"));

        d.addChild(new PersonWithoutFamily("f"));
        d.addChild(new PersonWithoutFamily("g"));

        a.sayName(0);
    }
}
