package org.imhui.java.core.thread;

import java.awt.*;
import java.util.concurrent.*;

/**
 * @author: imhuis
 * @date: 2023/7/13
 * @description:
 */
public class FutureClassExample {
    public static void main(String[] args) {

        // FutureTask >> I RunnableFuture >> I Runnable & I Future
        FutureTask<Integer> task = new FutureTask<>(() -> {
            int sum = 0;
            for (int i = 0; i < 10000; i++) {
                sum += i;
            }
            return sum;
        });

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(task);

        try {
            int result = task.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        executorService.shutdown();

    }
}
