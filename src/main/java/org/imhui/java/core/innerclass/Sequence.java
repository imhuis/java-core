package org.imhui.java.core.innerclass;

/**
 * @author: imhuis
 * @date: 2023/8/8
 * @description:
 */
public class Sequence {
    private Object[] items;
    private int next = 0;
    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object item) {
        if (next < items.length) {
            items[next++] = item;
        }
    }

    private class SequenceSelector implements Selector {
        private int i = 0;
        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length) {
                i++;
            }
        }
    }

    public SequenceSelector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }
    }
}

interface Selector {
    boolean end();
    Object current();
    void next();
}
