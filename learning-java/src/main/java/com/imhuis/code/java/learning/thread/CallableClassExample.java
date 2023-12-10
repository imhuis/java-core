package com.imhuis.code.java.learning.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author: imhuis
 * @date: 2022/6/12
 * @description:
 */
public class CallableClassExample {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<String>> futureList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            futureList.add(executorService.submit(new TaskWithResult(i)));
        }
        futureList.forEach(f -> {
            try {
                TimeUnit.SECONDS.sleep(1);
                System.out.println(f.get());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        });
        executorService.shutdown();

    }

    static class TaskWithResult implements Callable<String> {
        private int id;

        public TaskWithResult(int id) {
            this.id = id;
        }

        @Override
        public String call() throws Exception {
            return "result is " + id;
        }
    }
}