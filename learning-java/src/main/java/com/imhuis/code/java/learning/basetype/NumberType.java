package com.imhuis.code.java.learning.basetype;

/**
 * @author: imhuis
 * @date: 2023/11/29
 * @description:
 */
public class NumberType {

    public static void main(String[] args) {
        double d = 341_435_936.445_667;
        System.out.println(d);
        int bin = 0b0010_1111_1010_1111_1010_1111_1010_1111;
        System.out.println(Integer.toBinaryString(bin));
        System.out.printf("%x%n", bin);
        long hex = 0x7f_e9_b7_aa;
        System.out.printf("%x%n", hex);

        // 科学计数法
        double dd = 123e10;
        System.out.printf("%f%n", dd);
    }

}
