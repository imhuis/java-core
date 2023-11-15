package org.imhui.java.core.accessmodifiers;

/**
 * @author: imhuis
 * @date: 2023/8/6
 * @description:
 */
public class Foo extends Bar {

    private void abc() {

    }

    private final void bca() {

    }

    // 只能重载
    protected final void ccc(String a) {

    }



    public static void main(String[] args) {

    }
}
