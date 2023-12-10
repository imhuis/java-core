package com.imhuis.code.java.learning.collections;

import java.util.List;
import java.util.ListIterator;

/**
 * @author: imhuis
 * @date: 2023/12/5
 * @description:
 */
public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        ListIterator<Integer> integerListIterator = nums.listIterator();
        while (integerListIterator.hasNext()) {
            System.out.println(integerListIterator.next());
        }
    }
}
