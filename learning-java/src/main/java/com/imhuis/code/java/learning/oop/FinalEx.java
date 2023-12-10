package com.imhuis.code.java.learning.oop;

/**
 * @author: imhuis
 * @date: 2023/12/1
 * @description:
 */
public class FinalEx {
    // 编译时常量
    public final String ABC = "ABC";

    // 表达式赋值初始化
    private final int i = 0;

    // 空白final
    private final int j;

    {
        j = 1;
    }

//    public FinalEx(int j) {
//        this.j = j;
//    }
}
