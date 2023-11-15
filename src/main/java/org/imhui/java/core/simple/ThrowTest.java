package org.imhui.java.core.simple;

/**
 * @author: imhuis
 * @date: 2022/2/3
 * @description:
 */
public class ThrowTest {

    public static void main(String[] args) {
        try {
            process2();
        } catch (Exception e) {
//            e.initCause(e);
//            e.printStackTrace();
            Throwable cause = e.getCause();
            System.out.println(cause.toString());
        }
    }

    static void process1() {
        process2();
    }

    static void process2() {
        Integer.parseInt("abc"); // 会抛出NumberFormatException
    }
}
