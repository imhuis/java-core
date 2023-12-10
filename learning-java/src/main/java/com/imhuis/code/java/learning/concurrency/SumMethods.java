package com.imhuis.code.java.learning.concurrency;

/**
 * @author: imhuis
 * @date: 2022/2/7
 * @description:
 */
public class SumMethods {

    private int sum = 0;

    public synchronized void calculate() {
        setSum(getSum() + 1);
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
