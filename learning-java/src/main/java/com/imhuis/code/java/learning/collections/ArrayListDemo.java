package com.imhuis.code.java.learning.collections;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * @author: imhuis
 * @date: 2022/10/1
 * @description:
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(12, 11, 23, 34);
        integers.add(13);

        ListIterator<Integer> integerListIterator = integers.listIterator();
        integerListIterator.hasNext();
        integerListIterator.nextIndex();
        integerListIterator.previousIndex();
    }
}
