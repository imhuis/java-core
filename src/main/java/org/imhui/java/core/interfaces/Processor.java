package org.imhui.java.core.interfaces;

/**
 * @author: imhuis
 * @date: 2023/8/8
 * @description:
 */
public interface Processor {
    Object process(Object input);

    default String name() {
        return getClass().getName();
    }

    static void apply(Processor p, Object i) {
        p.process(i);
    }

}

interface StringProcessor extends Processor {
    @Override
    Object process(Object input);

    static void main(String[] args) {

    }
}
