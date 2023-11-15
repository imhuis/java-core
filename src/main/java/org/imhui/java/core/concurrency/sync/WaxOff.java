package org.imhui.java.core.concurrency.sync;

import java.util.concurrent.TimeUnit;

/**
 * @author: imhuis
 * @date: 2022/6/14
 * @description:
 */
public class WaxOff implements Runnable {

    private Car car;

    public WaxOff(Car car) {
        this.car = car;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                System.out.println("Wax off!");
                TimeUnit.MILLISECONDS.sleep(6);
                car.buffed();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
