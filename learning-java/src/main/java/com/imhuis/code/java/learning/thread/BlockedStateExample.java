package com.imhuis.code.java.learning.thread;

import org.junit.Test;

/**
 * @author: imhuis
 * @date: 2023/7/14
 * @description:
 */
public class BlockedStateExample {
    @Test
    public void blockTest() throws InterruptedException {
        Thread a = new Thread(() -> {
            sync();
        }, "a");

        Thread b = new Thread(() -> {
            sync();
        }, "b");


        a.start();
        Thread.sleep(1000L);
        b.start();
        System.out.println(a.getName() + " " + a.getState());
        System.out.println(b.getName() + " " + b.getState());
    }

    private synchronized void sync() {
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
