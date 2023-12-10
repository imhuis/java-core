package com.imhuis.code.java.learning.interfaces;

/**
 * @author: imhuis
 * @date: 2023/8/8
 * @description: 模版方法
 */
public interface Operation {
    void execute();

    static void runOps(Operation... ops) {
        for (Operation op: ops) {
            op.execute();
        }
    }
}
