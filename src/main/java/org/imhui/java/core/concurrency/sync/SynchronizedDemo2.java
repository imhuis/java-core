package org.imhui.java.core.concurrency.sync;

/**
 * @author: imhuis
 * @date: 2023/7/17
 * @description:
 */
public class SynchronizedDemo2 {
    Object object = new Object();
    public void method1() {
        synchronized (object) {

        }
        method2();
    }

    private static void method2() {

    }
}
