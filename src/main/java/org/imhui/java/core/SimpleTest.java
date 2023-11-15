package org.imhui.java.core;

import org.imhui.java.core.pojo.User;

import java.util.*;

/**
 * @author: imhuis
 * @date: 2022/2/1
 * @description:
 */
public class SimpleTest {

    public void test1() {
        String a = "";
        Optional<User> o = Optional.of(new User());
//        o.orElse("");
//        o.orElseGet(() -> "");

        Optional<String> s = o.map(u -> u.getName()).map(u -> u.toUpperCase());
        List list = new ArrayList();
    }

    public void test2() {
        Set<String> map = new TreeSet<>();
    }
}
