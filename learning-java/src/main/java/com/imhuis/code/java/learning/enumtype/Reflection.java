package com.imhuis.code.java.learning.enumtype;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author: imhuis
 * @date: 2023/11/16
 * @description:
 */

enum Explore { HERE, THERE }

@Slf4j
public class Reflection {
    public static Set<String> analyze(Class<?> enumClass) {
        log.info("Running analyze() for {}", enumClass.getName());
        log.info("Interfaces: ");
        for(Type t : enumClass.getGenericInterfaces())
            log.info("\t interface: {}", t);
        log.info("Base: {}", enumClass.getSuperclass());

        log.info("Methods: ");
        Set<String> methods = new TreeSet<>();
        for(Method m : enumClass.getMethods())
            methods.add(m.getName());
        System.out.println(methods);
        return methods;
    }
    public static void main(String[] args) {
        Set<String> exploreMethods = analyze(Explore.class);
        Set<String> enumMethods = analyze(Enum.class);
        log.info("Explore.containsAll(Enum)? {}",
                exploreMethods.containsAll(enumMethods));
        log.info("Explore.removeAll(Enum): {}",
                exploreMethods.removeAll(enumMethods));
        // values()方法是编译器添加的一个静态方法
        log.info("Explore.removeAll(Enum): {}", exploreMethods); // [values]
    }
}
