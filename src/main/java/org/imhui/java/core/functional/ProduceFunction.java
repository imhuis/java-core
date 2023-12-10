package org.imhui.java.core.functional;

import java.util.function.Function;

/**
 * @author: imhuis
 * @date: 2023/12/10
 * @description: 高阶函数，一个能接受函数作为参数或能把函数当成返回值的函数
 */
interface FuncSS extends Function<String, String> {
}   // [1]

public class ProduceFunction {
    static FuncSS produce() {
        return s -> s.toLowerCase();             // [2]
    }

    public static void main(String[] args) {
        FuncSS f = produce();
        FuncSS f2 = (x) -> x.toUpperCase();
        System.out.println(f.apply("YELLING"));
        f.apply("yellow");
    }
}
/* Output:
yelling
*/
