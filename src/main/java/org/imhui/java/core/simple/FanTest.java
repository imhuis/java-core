package org.imhui.java.core.simple;

import java.time.LocalDate;

/**
 * @author: imhuis
 * @date: 2022/2/4
 * @description:
 */
public class FanTest {

    public static void main(String[] args) {
        LocalDate[] birthdays = {
                LocalDate.now(),
                LocalDate.of(1998,01,05),
                LocalDate.of(2000, 1, 1)
        };

        LocalDate text = Zi.getText(birthdays);
        System.out.println(text);

        Zi<String>[] zis = new Zi [10];
    }
}

class Zi<T> {

    private T node;

    public static <T extends Comparable> T getText(T... node) {
        return node[1];
    }

    public T getNode() {
        return node;
    }

    public void setNode(T node) {
        this.node = node;
    }
}