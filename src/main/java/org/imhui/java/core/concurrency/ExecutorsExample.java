package org.imhui.java.core.concurrency;

import org.checkerframework.checker.units.qual.min;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author: imhuis
 * @date: 2022/3/23
 * @description:
 */
public class ExecutorsExample {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<String> submit = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return null;
            }
        });


    }
}
