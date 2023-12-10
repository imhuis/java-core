package com.imhuis.code.java.learning.stream;

/**
 * @author: imhuis
 * @date: 2023/8/12
 * @description:
 */
public class Bubble {
    public final int i;
    public Bubble(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Bubble{" +
                "i=" + i +
                '}';
    }

    private static int count = 0;
    public static Bubble bubbler() {
        return new Bubble(count++);
    }
}
