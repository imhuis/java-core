package com.imhuis.code.java.learning.stream;

import java.util.stream.Stream;

/**
 * @author: imhuis
 * @date: 2023/8/12
 * @description:
 */
public class StreamOf {
    public static void main(String[] args) {
        Stream.of("", 1, new String(""), Integer.valueOf(1));
    }
}
