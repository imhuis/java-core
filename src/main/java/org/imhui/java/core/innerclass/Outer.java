package org.imhui.java.core.innerclass;

/**
 * @author: imhuis
 * @date: 2023/8/8
 * @description:
 */
public class Outer {
    class Inner {
        private int i = 11;

        public int getI() {
            return i;
        }
    }

    public Inner inner() {
        return new Inner();
    }


    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner inner = o.inner();
    }
}
