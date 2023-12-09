package org.imhui.java.core.innerclass;

/**
 * @author: imhuis
 * @date: 2023/8/8
 * @description:
 */
class Outer {
    void outer_f() {
        System.out.println("outer_f");
    }

    public class PubInner {
        public Outer outer() {
            // this == PubInner
            return Outer.this;
        }
    }

    public PubInner pub_inner() {
        return new PubInner();
    }

    private class PriInner {
        private int i = 11;

        public int getI() {
            return i;
        }
    }

    //  获取内部示例
    private PriInner pri_inner() {
        return new PriInner();
    }
}

public class TestInnerClass {
    public static void main(String[] args) {
        // 必须先创建外部类实例，才能创建内部类实例
        Outer o = new Outer();
        Outer.PubInner pub = o.pub_inner();
        // Outer.PriInner pri = o.pri_inner();

        Outer.PubInner pubInner = o.new PubInner();
        // PriInner priInner = o.new PriInner();

    }
}
