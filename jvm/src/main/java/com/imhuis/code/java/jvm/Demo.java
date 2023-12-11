package com.imhuis.code.java.jvm;

import com.imhuis.code.java.cornerstone.utils.Repeat;

/**
 * @author: imhuis
 * @date: 2023/12/11
 * @description:
 */
public class Demo {
    public static void main(String[] args) {
        Repeat.repeat(10, () -> System.out.println("Hello, World!"));
    }
}
