package org.imhui.java.core.thread;

import java.util.stream.IntStream;

/**
 * @author: imhuis
 * @date: 2023/7/13
 * @description: Thread的优先级并不是总是生效的
 */
public class ThreadPriorityExample {
    public static class T1 extends Thread {
        @Override
        public void run() {
            super.run();
            System.out.printf("current Thread%s, priority%d\n",
                    Thread.currentThread().getName(), Thread.currentThread().getPriority());
        }
    }

    public static void main(String[] args) {
        IntStream.range(1, 10).forEach(i -> {
            Thread t = new Thread(new T1());
            t.setPriority(i);
            t.start();
        });
    }
}
