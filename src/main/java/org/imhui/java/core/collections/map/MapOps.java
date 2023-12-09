package org.imhui.java.core.collections.map;

import java.util.Map;

/**
 * @author: imhuis
 * @date: 2023/11/24
 * @description:
 */

record A(String name) {

}

record B(String name) {

}
public class MapOps {

    static Map<String, String> map;



    public static void main(String[] args) {
//        map.entrySet().stream()
//                .map(Map.Entry::getValue)
//                .filter(v -> v.startsWith("Dark"))
//                .map(v -> v.replaceFirst("Dark", "Light"))
//                .forEach(System.out::println);

        Map.of(new A("a"), "b", new B("b"), "d");
    }
}
