package org.imhui.java.core.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author: imhuis
 * @date: 2023/7/18
 * @description:
 */
public class StreamFilterExample {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");

        System.out.println("Languages which starts with J :");
//        filter(languages, (str) -> str.startsWith("J"));

        System.out.println("Languages which ends with a ");
//        filter(languages, (str) -> str.endsWith("a"));

        System.out.println("Print all languages :");
        filter(languages, (str) -> true);

        System.out.println("Print no language : ");
        filter(languages, (str) -> false);

        System.out.println("Print language whose length greater than 4:");
//        filter(languages, (str) -> str.length() > 4);
    }

    public static void filter(List<String> names, Predicate condition) {
        names.stream().filter((name) -> (condition.test(name))).forEach((name) -> {
            System.out.println(name + " ");
        });
    }
}
