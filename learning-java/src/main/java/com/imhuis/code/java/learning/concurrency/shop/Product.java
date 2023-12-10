package com.imhuis.code.java.learning.concurrency.shop;

/**
 * @author: imhuis
 * @date: 2022/6/29
 * @description:
 */
public class Product {

    private int stock = 0;

    // 生产
    public synchronized void createProduct() {
        if (stock < 20) {
            stock++;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            notifyAll();
            System.out.println(Thread.currentThread().getName() + " 开始生产第 " + stock + " 个产品");
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    // 消费
    public synchronized void useProduct() {
        if (stock > 0) {
            System.out.println(Thread.currentThread().getName() + " 开始消费第 " + stock + " 个产品");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            stock--;
            notifyAll();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
