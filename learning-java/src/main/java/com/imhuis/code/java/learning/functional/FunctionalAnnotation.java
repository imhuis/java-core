package com.imhuis.code.java.learning.functional;

/**
 * @author: imhuis
 * @date: 2023/12/9
 * @description:
 */
@FunctionalInterface
interface Functional {
    String goodbye(String arg);
}

interface FunctionalNoAnn {
    String goodbye(String arg);
}

public class FunctionalAnnotation {
    public String goodbye(String arg) {
        return "Goodbye, " + arg;
    }

    public static void main(String[] args) {
        FunctionalAnnotation fa = new FunctionalAnnotation();
        Functional f = fa::goodbye;
        FunctionalNoAnn fna = fa::goodbye;
        // Functional fac = fa; // Incompatible
        Functional fu = a -> "Goodbye, " + a;
        FunctionalNoAnn functionalNoAnn = a -> "Goodbye, " + a;
    }
}
