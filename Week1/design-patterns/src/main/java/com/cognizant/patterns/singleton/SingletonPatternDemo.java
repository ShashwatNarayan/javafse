package com.cognizant.patterns.singleton;

public class SingletonPatternDemo {

    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Application started");
        logger2.warn("Low memory warning");
        logger1.error("Unhandled exception caught");

        System.out.println("Same instance: " + (logger1 == logger2));
    }
}
