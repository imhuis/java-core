package com.imhuis.code.java.learning.accessmodifiers.hiding;

import com.imhuis.code.java.learning.accessmodifiers.Bar;

/**
 * @author: imhuis
 * @date: 2023/8/6
 * @description:
 */
public class Too extends Bar {
    public void pub_abc() {
        System.out.println("Too method: pub_abc");
    }

    private void pri_abc() {
    }

    // 子类重写方法的权限必须大于等于父类同名方法权限
    protected void pro_abc() {
        System.out.println("Too method: pro_abc");
        pro_f_abc();
    }

    void de_abc() {
        System.out.println("Too method: de_abc");
        //        ccc(1); 默认方法只能同包调用
    }

}
