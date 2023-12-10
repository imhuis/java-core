package com.imhuis.code.java.learning.collections.queue;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author: imhuis
 * @date: 2023/7/18
 * @description:
 */
public class BlockingQueueExample {

    private int queueSize = 10;
    private ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(queueSize);

    public static void main(String[] args) {
        BlockingQueue bq = new LinkedBlockingQueue();
        BlockingQueueExample e = new BlockingQueueExample();
        Producer p = e.new Producer();
        Consumer s = e.new Consumer();
        p.start();
        s.start();
    }

    class Consumer extends Thread {
        @Override
        public void run() {
            consumer();
        }

        private void consumer() {
            while (true) {
                try {
                    Thread.sleep(1000);
                    queue.take();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("队列取出一个元素");
            }
        }
    }

    class Producer extends Thread {
        @Override
        public void run() {
            producer();
        }

        private void producer() {
            while (true) {
                try {
                    queue.put(new Random(10).nextInt());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.printf("队列新增一个元素, 此时队列剩余容量%d\n", queueSize - queue.size());
            }
        }
    }
}
