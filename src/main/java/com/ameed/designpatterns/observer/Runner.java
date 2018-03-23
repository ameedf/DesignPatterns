package com.ameed.designpatterns.observer;

public class Runner implements WaitingRunner {
    protected final String name;

    public Runner(String name) {
        this.name = name;
    }

    @Override
    public void handleAnnouncement(int n) {
        if (n == 0) {
            System.out.println(name + " starter to run on " + n);
        }
    }

}
