package org.imhui.java.core.concurrency.shop;

/**
 * @author: imhuis
 * @date: 2022/6/29
 * @description:
 */
public class ShopTest {
    public static void main(String[] args) {
        Product product = new Product();

        Producer producer = new Producer(product);
        producer.setName("生产者1");

        Consumer consumer = new Consumer(product);
        consumer.setName("消费者1");

        producer.start();
        consumer.start();

    }
}
