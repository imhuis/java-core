package com.imhuis.code.java.learning.concurrency;

/**
 * @author: imhuis
 * @date: 2022/2/7
 * @description:
 */
public class ThreadTest {

    private static void dumpThread(Thread thread) {
        System.out.printf("info:%s, state:%s", thread, thread.getState());
        System.out.println();
    }

    public static void main(String[] args) {
        syncTest();
    }

    public void aaa() {
        var thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread, I'm running now.");
            }
        }, "ThreadStateDemo");

        dumpThread(thread);

        thread.start();

        dumpThread(thread);
    }


    public static void syncTest() {
        Runnable runnable = new Runnable() {
            @Override
            public synchronized void run() {
//                synchronized (ThreadTest.this) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
//                }
            }
        };
        Thread threadA = new Thread(runnable, "thread-A");
        Thread threadB = new Thread(runnable, "thread-B");
        Thread threadC = new Thread(runnable, "thread-C");
        threadA.start();
        threadB.start();
        threadC.start();
        dumpThread(threadA);
        dumpThread(threadB);
        dumpThread(threadC);
    }
}
