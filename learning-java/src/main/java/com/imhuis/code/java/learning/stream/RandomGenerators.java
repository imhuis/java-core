package com.imhuis.code.java.learning.stream;

import java.util.Random;
import java.util.stream.Stream;

/**
 * @author: imhuis
 * @date: 2023/8/12
 * @description:
 */
public class RandomGenerators {

    public void generate() {
        Stream.generate(Bubble::bubbler).limit(5).forEach(System.out::println);
    }
    public static void main(String[] args) {
        Random random = new Random(47);
        Stream<Integer> stream = random.ints().boxed();
        stream.limit(10).forEach(System.out::println);
    }
}
