package com.imhuis.code.java.learning.classtype;

/**
 * @author: imhuis
 * @date: 2022/3/12
 * @description:
 */
public class OuterClass {

    private static final StringBuilder A;
    private final StringBuilder B;
    private String name;
    private int number;

    static {
        A = new StringBuilder();
    }

    {
        B = new StringBuilder();
    }

    private static class InnerClass {

//        public InnerClass(String name, int number) {
//            OuterClass.this.name = name;
//            OuterClass.this.number = number;
//        }

        public void display() {
            System.out.println(A);
        }
    }


    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        OuterClass.InnerClass inner = new InnerClass();
    }

}
