package com.imhuis.code.java.cornerstone.utils;

import java.util.stream.IntStream;

/**
 * @author: imhuis
 * @date: 2023/12/10
 * @description:
 */
public class Repeat {
    public static void repeat(int n, Runnable action) {
        IntStream.range(0, n).forEach(i -> action.run());
    }
}
