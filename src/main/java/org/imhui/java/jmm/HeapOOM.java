package org.imhui.java.jmm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: imhuis
 * @date: 2023/7/24
 * @description: VM Args: -Xms20m -Xmx=20m -XX:+HeapDumpOnOutOfMemoryError
 */
public class HeapOOM {

    static class OOMObject {

    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();
        while (true) {
            list.add(new OOMObject());
        }
    }
}
