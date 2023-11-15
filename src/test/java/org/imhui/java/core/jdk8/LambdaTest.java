package org.imhui.java.core.jdk8;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @author: imhuis
 * @date: 2022/2/1
 * @description:
 */
public class LambdaTest {

    @Test
    public void test1() {
        String[] args = new String[]{"abc", "zzz", "oops", "apple", "sort"};
        // (o1, o2) -> o1.length() - o2.length()
        Arrays.sort(args, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(args));
    }

    @Test
    public void test2() {
        new Thread(() -> System.out.println("this is a thread")).start();
    }

    public void test3() {
        Comparator<String> comparator = Comparator.comparingInt(String::length);
    }

    @Test
    public void test4() {
        Consumer<String> consumer = System.out::println;
        consumer.accept("aa");
    }

    @Test
    public void test5() {
        InterfaceWithException i = (x) -> {throw new Exception(); };
    }

}
