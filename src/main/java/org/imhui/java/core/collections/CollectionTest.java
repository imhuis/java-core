package org.imhui.java.core.collections;

import org.junit.Test;

import java.util.*;

/**
 * @author: imhuis
 * @date: 2022/6/15
 * @description:
 */
public class CollectionTest {

    @Test
    public void test() {
        var list = new ArrayList<String>();
        Collections.shuffle(list);
        list.listIterator();
    }
}
