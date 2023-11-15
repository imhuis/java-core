package org.imhui.java.core.interfaces.nesting;

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

    public class BImpl2 implements B {
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

    private class CImpl2 implements C {
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

    public class DImpl2 implements D {
        @Override
        public void f() {}
    }

    public D getD() {
        return new DImpl2();
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

    public interface H {
        void f();
    }

    void g();
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

    public static void main(String[] args) {

    }
}