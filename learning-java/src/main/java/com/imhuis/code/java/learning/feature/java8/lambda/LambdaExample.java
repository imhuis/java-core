package com.imhuis.code.java.learning.feature.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author: imhuis
 * @date: 2022/3/24
 * @description:
 */
public class LambdaExample {

    public static void main(String[] args) {
        int i = 0;
        ArrayList<String> strings = new ArrayList<>();
        strings.add("111");
        strings.add("222");
        Collections.sort(strings, (String o1, String o2) -> o1.length() - i + 1);

    }
}
