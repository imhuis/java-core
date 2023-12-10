package com.imhuis.code.java.learning.interfaces.nesting;

/**
 * @author: imhuis
 * @date: 2023/8/8
 * @description:
 */
class A {
    interface B {
        void f();
    }

    public class BImpl implements B {
        @Override
        public void f() {}
    }

    public interface C {
        void f();
    }

    class CImpl implements C {
        @Override
        public void f() {}
    }

    private interface D {
        void f();
    }

    private class DImpl implements D {
        @Override
        public void f() {}
    }

    public D getD() {
        return new DImpl();
    }

    private D dRef;
    public void receiveD(D d) {
        dRef = d;
        dRef.f();
    }
}

interface E {
    interface G {
        void f();
    }

    // public多余
    public interface H {
        void f();
    }

    void g();

    // 接口不能是private
    interface I {}
}

public class NestingInterfaces {
    public class BImp implements A.B {
        @Override
        public void f() {}
    }

    class CImpl implements A.C {
        @Override
        public void f() {}
    }

    // 私有类型的接口只能在私有类中实现
//    class DImpl implements A.D {
//
//    }

    class EImpl implements E {

        @Override
        public void g() {

        }

        class EG implements E.G {

            @Override
            public void f() {

            }
        }
    }
    class EGImpl implements E.G {

        @Override
        public void f() {

        }
    }

    public static void main(String[] args) {
        A a = new A();

    }
}