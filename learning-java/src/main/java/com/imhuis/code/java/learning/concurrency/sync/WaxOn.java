package com.imhuis.code.java.learning.concurrency.sync;

import java.util.concurrent.TimeUnit;

/**
 * @author: imhuis
 * @date: 2022/6/14
 * @description:
 */
public class WaxOn implements Runnable {
    private Car car;

    public WaxOn(Car car) {
        this.car = car;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                System.out.println("Wax on!");
                TimeUnit.MILLISECONDS.sleep(200);
                car.waxed();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
