package com.imhuis.code.java.learning.concurrency;

/**
 * @author: imhuis
 * @date: 2022/2/7
 * @description:
 */
public class DD implements Runnable {

    private static final Object object = new Object();

    @Override
    public void run() {
        synchronized(object) {
            try {
                Thread.interrupted();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
