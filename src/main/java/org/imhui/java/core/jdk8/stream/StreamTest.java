package org.imhui.java.core.jdk8.stream;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author: imhuis
 * @date: 2022/7/23
 * @description:
 */
@Slf4j
public class StreamTest {

    @Test
    public void intStream() {
        int[] ints = IntStream.range(1, 10).toArray();
        log.info("int array's {}", ints);
        IntStream.range(1, 10).forEach(System.out::println);
    }

    @Test
    public void generate() {
        Stream.generate(() -> "Hello World!")
                .limit(3)
                .forEach(System.out::println);
    }

    @Test
    public void test1() {
        Stream.iterate(0, i -> i < 5, i -> i + 1).forEach(
                System.out::println
        );
    }

    @Test
    public void test2() {
        Double a1 = Stream.of(1, 2, 3, 4, 5).collect(Collectors.averagingInt(i -> i));
        Double a2 = Stream.of(1, 2, 3, 4, 5).collect(Collectors.summingDouble(i -> i));
        System.out.println(a1/a2);
    }

    @Test
    public void test3() {
        double a = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.teeing(
                        Collectors.averagingInt(i -> i),
                        Collectors.summingInt(i -> i),
                        (avg, sum) -> avg / sum));
        System.out.println(a);
    }

}
