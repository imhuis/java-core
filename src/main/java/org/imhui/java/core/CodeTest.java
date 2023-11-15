package org.imhui.java.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: imhuis
 * @date: 2022/2/1
 * @description:
 */
public class CodeTest {

    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        lines.add("aaa bbb ccc");
        lines.add("111 222 333");
        List<List<String>> collect = lines
                .stream().map(l -> l.split(" ")).map(Arrays::asList).collect(Collectors.toList());


        List<String> collect1 = lines
                .stream().map(l -> l.split(" ")).flatMap(Arrays::stream).collect(Collectors.toList());
        collect1.forEach(System.out::println);
    }
}
