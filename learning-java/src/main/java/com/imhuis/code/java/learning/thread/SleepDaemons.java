package com.imhuis.code.java.learning.thread;

import java.util.concurrent.TimeUnit;

/**
 * @author: imhuis
 * @date: 2022/6/12
 * @description:
 */
public class SleepDaemons implements Runnable {

    @Override
    public void run() {
        while (true) {
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread() + "" + this);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new SleepDaemons());
            thread.setDaemon(true);
            thread.start();
        }
        System.out.println("All daemons started");
        Thread.sleep(1000000);
    }
}
