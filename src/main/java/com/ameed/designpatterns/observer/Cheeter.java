package com.ameed.designpatterns.observer;

public class Cheeter extends Runner {

    public Cheeter(String name) {
        super(name);
    }

    @Override
    public void handleAnnouncement(int n) {
        if (n == 2) {
            System.out.println(super.name + " is cheeting and starting to run on " + n);
        }
    }

}
