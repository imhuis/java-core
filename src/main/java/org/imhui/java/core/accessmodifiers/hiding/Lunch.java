package org.imhui.java.core.accessmodifiers.hiding;

/**
 * @author: imhuis
 * @date: 2023/8/6
 * @description:
 */
public class Lunch {

}

class Soup1 {
    private Soup1(){
    }
}

class Soup2 {
    private static Soup2 sp2 = new Soup2();
    private Soup2() {
    }
    public static Soup2 access() {
        return sp2;
    }
}
