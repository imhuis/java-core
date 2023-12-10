package com.imhuis.code.java.learning.concurrency.sync;

/**
 * @author: imhuis
 * @date: 2023/7/16
 * @description:
 */
public class CountOneTo {

    private static Object lock = new Object();
    static class ThreadA implements Runnable {

        @Override
        public void run() {
            synchronized (lock) {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread() + "\t" + i);
                }
            }

        }
    }

    static class ThreadB implements Runnable {

        @Override
        public void run() {
            synchronized (lock) {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread() + "\t" + i);
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread a = new Thread(new ThreadA());
        Thread b = new Thread(new ThreadB());

        a.start();
        b.start();
    }


}
