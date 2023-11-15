package org.imhui.java.core.concurrency.sync;

/**
 * @author: imhuis
 * @date: 2022/6/14
 * @description:
 */
public class Car {
    private boolean waxOn = false;

    public synchronized void waxed() {
        waxOn = true;
        notifyAll();
    }

    public synchronized void buffed() {
        waxOn = false;
        notifyAll();
    }

    public synchronized void waitForWaxing() throws InterruptedException {
        if (waxOn == false) {
            wait();
        }
    }

    public synchronized void waitForBuffing() throws InterruptedException {
        if (waxOn == true) {
            wait();
        }
    }
}
