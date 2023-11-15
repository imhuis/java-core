package org.imhui.java.jmm;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: imhuis
 * @date: 2023/7/24
 * @description: VM Args:-XX:PermSize=6M -XX:MaxPermSize=6M
 * -Xmx6m
 */
public class RuntimeConstantPoolOOM {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        short i = 0;
        while (true) {
            set.add(String.valueOf(i++).intern());
        }
    }
}
