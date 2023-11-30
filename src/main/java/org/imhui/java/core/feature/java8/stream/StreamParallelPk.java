package org.imhui.java.core.feature.java8.stream;

import java.util.stream.IntStream;

/**
 * @author: imhuis
 * @date: 2023/7/18
 * @description:
 */
public class StreamParallelPk {
    public static void main(String[] args) {
        long t0 = System.nanoTime();

        int a[]=IntStream.range(0, 1_000_000).filter(p -> p % 2==0).toArray();

        long t1 = System.nanoTime();

        int b[]= IntStream.range(0, 1_000_000).parallel().filter(p -> p % 2==0).toArray();

        long t2 = System.nanoTime();
        System.out.printf("serial: %.2fs, parallel %.2fs%n", (t1 - t0) * 1e-9, (t2 - t1) * 1e-9);
    }
}
