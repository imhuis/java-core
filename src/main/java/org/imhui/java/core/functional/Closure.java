package org.imhui.java.core.functional;


import java.util.function.IntSupplier;

/**
 * @author: imhuis
 * @date: 2023/12/10
 * @description:
 */
public class Closure {
    int i;

    // lambda表达式中的变量是final的，不能修改
    IntSupplier makeFun(int x) {
        int i = 0;
        return () -> x + i;
    }

    public static void main(String[] args) {
        Closure c = new Closure();
        IntSupplier int1 = c.makeFun(1);
        IntSupplier int2 = c.makeFun(2);
        System.out.println(int1.getAsInt());
        System.out.println(int2.getAsInt());


    }
}
