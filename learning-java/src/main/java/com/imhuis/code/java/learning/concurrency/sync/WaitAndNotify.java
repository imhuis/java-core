package com.imhuis.code.java.learning.concurrency.sync;

/**
 * @author: imhuis
 * @date: 2023/7/16
 * @description: 两个线程交替输出i
 */
public class WaitAndNotify {

    private static Object lock = new Object();

    static class ThreadA implements Runnable {

        @Override
        public void run() {
            synchronized (lock) {
                for (int i = 0; i <= 5; i++) {
                    System.out.println(Thread.currentThread() + "\t" + i);
                    lock.notify();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }

    static class ThreadB implements Runnable {

        @Override
        public void run() {
            synchronized (lock) {
                for (int i = 0; i <= 5; i++) {
                    System.out.println(Thread.currentThread() + "\t" + i);
                    lock.notify();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {

        new Thread(new ThreadA()).start();
        new Thread(new ThreadB()).start();

    }
}
