package com.imhuis.code.java.learning.enumtype;

/**
 * @author: imhuis
 * @date: 2022/11/7
 * @description:
 */
public class EnumClass {
    public static void main(String[] args) {
        for (Shrubbery s : Shrubbery.values()) {
            System.out.println(s.ordinal());
            System.out.println(s.getDeclaringClass());
        }

        for (String s : "HANGING GROUND CRAWLING".split(" ")) {
            Shrubbery shrubbery = Enum.valueOf(Shrubbery.class, s);
            System.out.println("[] :" + shrubbery);
        }

        for (int i = 0; i < 20; i++) {
            System.out.println(Enums.random(Shrubbery.class));
        }
    }
}
enum Shrubbery {
    GROUND, CRAWLING, HANGING
}
