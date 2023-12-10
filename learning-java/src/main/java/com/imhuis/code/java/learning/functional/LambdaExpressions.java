package com.imhuis.code.java.learning.functional;

/**
 * @author: imhuis
 * @date: 2023/12/9
 * @description: 未绑定方法引用
 */

interface Description {
    String brief();
}

interface Body {
    String detailed(String head);
}

interface Multi {
    String twoArg(String head, Double d);
}

public class LambdaExpressions {

    static Body bod = h -> h + " No Parens!";      // [1]

    static Body bod2 = (h) -> h + " More details"; // [2]单参数括号不常见

    static Description desc = () -> "Short info";  // [3]无参数必须使用括号指示空参列表

    static Multi mult = (h, n) -> h + n;           // [4]

    static Description moreLines = () -> {         // [5]多行代码需要使用花括号
        System.out.println("moreLines()");
        return "from moreLines()";
    };

    public static void main(String[] args) {
        System.out.println(bod.detailed("Oh!"));
        System.out.println(bod2.detailed("Hi!"));
        System.out.println(desc.brief());
        System.out.println(mult.twoArg("Pi! ", 3.14159));
        System.out.println(moreLines.brief());
    }
}

/* Output:
Oh! No Parens!
Hi! More details
Short info
Pi! 3.14159
moreLines()
from moreLines()
*/