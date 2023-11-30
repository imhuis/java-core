package org.imhui.java.core.feature.java8.stream;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/**
 * @author: imhuis
 * @date: 2022/3/12
 * @description:
 */
@Slf4j
public class RandomTest {

    public static void main(String[] args) {
        Random random = new Random();
        DoubleStream doubles = random.doubles();
        doubles.limit(200).forEach(System.out::println);

        IntStream ints = random.ints();
        ints.limit(200).forEach(System.out::println);
    }

    @Test
    public void test1() {
        new Random(47)
                .ints(5, 20)
                .distinct()
                .limit(7)
                .sorted()
                .forEach(System.out::println);
    }
}
