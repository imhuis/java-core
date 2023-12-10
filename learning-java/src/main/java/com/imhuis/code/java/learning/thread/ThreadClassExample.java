package com.imhuis.code.java.learning.thread;

/**
 * @author: imhuis
 * @date: 2022/6/13
 * @description:
 */
public class ThreadClassExample {
    public static void main(String[] args) {
        Thread thread = new Thread();
        Thread t = Thread.currentThread();
        thread.start();// 执行线程方法
        Thread.yield();// 释放当前线程对cpu的调度
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    
}
