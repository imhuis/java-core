package com.imhuis.code.java.learning.collections;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

/**
 * @author: imhuis
 * @date: 2023/11/23
 * @description:
 */
@Slf4j
public class SetOps {
    static String[] set = {
            "java.util.HashSet",

            /** 对元素进行排序 **/
            "java.util.TreeSet",
            "java.util.concurrent.ConcurrentSkipListSet",

            /** 保留元素插入顺序 **/
            "java.util.LinkedHashSet",
            "java.util.concurrent.CopyOnWriteArraySet",
    };

    // random words
    public static List<String> Numbers = List.of(
            "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"
    );

    static final List<String> RLIST = new ArrayList<>();

    static {
        Collections.reverseOrder();
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        for (String clazz: set) {
            log.info("clazzName: {}", clazz.substring(clazz.lastIndexOf(".") + 1));
            Set<String> set = (Set<String>) Class.forName(clazz).getConstructor().newInstance();
            set.addAll(Numbers);
            set.stream().limit(10).forEach(x -> System.out.printf("%s \t", x));
            System.out.println();
        }
    }
}
