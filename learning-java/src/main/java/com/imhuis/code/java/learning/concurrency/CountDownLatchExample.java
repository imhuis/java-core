package com.imhuis.code.java.learning.concurrency;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: imhuis
 * @date: 2022/6/4
 * @description:
 */
public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        ThreadUnsafeExample threadUnsafeExample = new ThreadUnsafeExample();
        final CountDownLatch countDownLatch = new CountDownLatch(1000);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 1000; i++) {
            executorService.execute(() -> {
                threadUnsafeExample.add();
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        executorService.shutdown();
        System.out.println(threadUnsafeExample.get());
    }

    public static class ThreadUnsafeExample {
        private volatile int count = 0;

        public void add() {
            count++;
        }

        public int get() {
            return count;
        }
    }
}
