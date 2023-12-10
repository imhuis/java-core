package com.imhuis.code.java.learning.collections;

import com.imhuis.code.java.learning.collections.datasource.HTMLColors;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author: imhuis
 * @date: 2023/11/23
 * @description: List的操作
 */
public class ListOps {

    static final List<String> LIST = HTMLColors.LIST.subList(0, 10);

    private static boolean b;
    private static String s;
    private static int i;
    private static Iterator<String> it;
    private static ListIterator<String> lit;

    public static void main(String[] args) {
        LIST.add(1, "one");
        LIST.add("two");
        LIST.addAll(3, LIST);

        b = LIST.contains("one");
        b = LIST.contains(LIST);
    }
}
