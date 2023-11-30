package org.imhui.java.core.collections.map;

import java.util.Map;

/**
 * @author: imhuis
 * @date: 2023/11/24
 * @description:
 */
public class MapOps {

    static Map<String, String> map;

    public static void main(String[] args) {
        map.entrySet().stream()
                .map(Map.Entry::getValue)
                .filter(v -> v.startsWith("Dark"))
                .map(v -> v.replaceFirst("Dark", "Light"))
                .forEach(System.out::println);
    }
}
