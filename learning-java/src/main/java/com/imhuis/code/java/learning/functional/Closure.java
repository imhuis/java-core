package com.imhuis.code.java.learning.functional;


import java.util.ArrayList;
import java.util.List;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

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
        i++;
        final int jFinal = 0;
        return () -> x + jFinal;
    }

    Supplier<List<Integer>> makeFun() {
        ArrayList<Integer> numbers = new ArrayList<>();
        // numbers = new ArrayList<>(); 编译失败
        numbers.add(1);
        return () -> numbers;
    }

    public static void main(String[] args) {
        Closure c = new Closure();
        IntSupplier int1 = c.makeFun(1);
        IntSupplier int2 = c.makeFun(2);
        System.out.println(int1.getAsInt());
        System.out.println(int2.getAsInt());

        c.makeFun().get().add(2);

    }
}
