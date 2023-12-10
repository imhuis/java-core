package org.imhui.java.core.functional;

/**
 * @author: imhuis
 * @date: 2023/12/10
 * @description:
 */

class This {
    void two(int i, double d) {
    }

    void three(int i, double d, String s) {
    }

    void four(int i, double d, String s, char c) {
    }
}

interface TwoArgs {
    void call(This th, int i, double d);
}

interface ThreeArgs {
    void call(This th, int i, double d, String s);
}

interface FourArgs {
    void call(This th, int i, double d, String s, char c);
}

public class MultiUnbound {
    public static void main(String[] args) {
        TwoArgs twoargs = This::two;
        twoargs.call(new This(), 11, 3.14);

        ThreeArgs threeargs = This::three;
        threeargs.call(new This(), 11, 3.14, "Three");

        FourArgs fourargs = This::four;
        fourargs.call(new This(), 11, 3.14, "Four", 'Z');
    }
}
