package org.imhui.java.core.stream;

import java.util.stream.IntStream;

/**
 * @author: imhuis
 * @date: 2023/8/12
 * @description:
 */
public class Repeat {
    public static void repeat(int n, Runnable action) {
        IntStream.range(0, n).forEach(i -> action.run());
    }
}
