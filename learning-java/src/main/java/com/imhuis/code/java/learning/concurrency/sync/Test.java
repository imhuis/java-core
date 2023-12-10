package com.imhuis.code.java.learning.concurrency.sync;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author: imhuis
 * @date: 2022/6/14
 * @description:
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Car car = new Car();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(new WaxOff(car));
        executorService.submit(new WaxOn(car));
        TimeUnit.SECONDS.sleep(60);
        executorService.shutdown();
    }
}
