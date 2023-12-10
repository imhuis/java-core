package com.imhuis.code.java.learning.oop.reuse;

/**
 * @author: imhuis
 * @date: 2023/12/1
 * @description:
 */
public class Derived2 extends BaseWithEmptyConstructor {

    public Derived2(String s) {
        // 必须显示调用
        super(s);
    }
}
