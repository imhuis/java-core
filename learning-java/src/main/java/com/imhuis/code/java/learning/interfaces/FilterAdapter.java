package com.imhuis.code.java.learning.interfaces;

/**
 * @author: imhuis
 * @date: 2023/8/8
 * @description:
 */
public class FilterAdapter implements Processor {

    @Override
    public Object process(Object input) {
        return null;
    }

    @Override
    public String name() {
        return Processor.super.name();
    }
}
