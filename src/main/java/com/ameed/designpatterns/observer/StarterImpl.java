package com.ameed.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class StarterImpl implements Starter {
    private List<WaitingRunner> runners;

    public StarterImpl() {
        this.runners = new ArrayList<>(10);
    }

    // notify all
    @Override
    public void announce(int n) {
        System.out.println("Count is " + n);
        for (WaitingRunner r : runners) {
            r.handleAnnouncement(n);
        }
    }

    // register
    @Override
    public void addWaitingRunner(WaitingRunner runner) {
        this.runners.add(runner);
    }

}
