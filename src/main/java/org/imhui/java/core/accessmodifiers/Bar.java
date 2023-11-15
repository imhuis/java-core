package org.imhui.java.core.accessmodifiers;

/**
 * @author: imhuis
 * @date: 2023/8/6
 * @description:
 */
public class Bar {

    private void abc() {

    }

    private final void bca() {

    }

    protected final void ccc() {

    }

    public static void main(String[] args) {
        new PublicConstructor();
    }
}
