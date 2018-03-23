package com.ameed.designpatterns.observer;

// Observable / Subject
public interface Starter {
    // notify
    public void announce(int n);

    // subscribe
    public void addWaitingRunner(WaitingRunner runner);
}
