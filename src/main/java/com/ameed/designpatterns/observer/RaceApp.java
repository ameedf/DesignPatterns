package com.ameed.designpatterns.observer;

import java.util.Random;

public class RaceApp {

    public static void main(String[] args) {
        Starter s = new StarterImpl();
        for (int i = 0; i < 10; i++) {
            Runner runner;
            if (new Random().nextFloat() < 0.2) {
                runner = new Cheeter("Cheeter " + i);
            } else {
                runner = new Runner("Runner " + i);
            }
            s.addWaitingRunner(runner);
        }

        for (int i = 5; i >= 0; i--) {
            s.announce(i);
        }
    }
}
