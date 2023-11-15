package org.imhui.java.core.concurrency.shop;

/**
 * @author: imhuis
 * @date: 2022/6/29
 * @description:
 */
public class Consumer extends Thread {

    private Product product;

    public Consumer(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        System.out.println("开始消费产品...");
        while (true) {
            product.useProduct();
        }
    }
}
