package org.imhui.java.core.reflection.domain;

import java.util.Arrays;

/**
 * @author: imhuis
 * @date: 2023/8/13
 * @description:
 */
public class ReflectionTest {
    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("org.imhui.java.core.reflection.domain.FancyToy");
        }catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }

        System.out.printf("class name: %s\n", c.getName());
        System.out.printf("Is interface: %b\n", c.isInterface());
        System.out.printf("simpleName: %s\n", c.getSimpleName());
        System.out.printf("canonical name: %s\n", c.getCanonicalName());
        System.out.println(Arrays.toString(c.getInterfaces()));

        for (Class cc : c.getInterfaces()){
            System.out.println(cc.getName() + "");
            System.out.println(cc.getSimpleName() + "");
            System.out.println();
        }

        Class superclass = c.getSuperclass();
        System.out.println(superclass.getName() + "" + superclass.getCanonicalName());
    }
}

interface HasBatteries {}
interface Waterproof {}
interface Shoots {}

class Toy {
    public Toy() {}
    public Toy(String name) {}
    public Toy(int i) {}
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
    public FancyToy() {
        super("name");
    }
}