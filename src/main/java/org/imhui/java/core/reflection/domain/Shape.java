package org.imhui.java.core.reflection.domain;

/**
 * @author: imhuis
 * @date: 2023/8/13
 * @description:
 */
public abstract class Shape {
    void draw() {
        System.out.println(this + ".draw()");
    }

    @Override
    public abstract String toString();
}
