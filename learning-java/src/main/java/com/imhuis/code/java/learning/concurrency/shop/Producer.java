package com.imhuis.code.java.learning.concurrency.shop;

/**
 * @author: imhuis
 * @date: 2022/6/29
 * @description:
 */
public class Producer extends Thread {

    private Product product;

    public Producer(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        System.out.println("开始生产产品...");
        while (true) {
            product.createProduct();
        }
    }
}
