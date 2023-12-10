package com.imhuis.code.java.learning.accessmodifiers;

/**
 * @author: imhuis
 * @date: 2023/8/6
 * @description:
 */
public class Foo extends Bar {

    // 覆盖父类公有方法
    public void pub_abc() {
        System.out.println("Foo method: pub_abc");
    }

    // final方法不能被覆盖
    // public final void pub_f_abc() {}

    // 不会覆盖父类私有方法,父类子类没关系
    private void pri_abc() {
        System.out.println("Foo method: pri_abc");
        //        pri_f_abc();
    }

    // 子类重写方法的权限必须大于等于父类同名方法权限
    protected void pro_abc() {
        System.out.println("Foo method: pro_abc");
        // 调用父类受保护方法
        pro_f_abc();
    }

    // 子类方法可以设置为最终方法
    // protected final void pro_abc() {}

    void de_abc() {
        System.out.println("Foo method: de_abc");
        // 调用父类默认方法
        ccc(1);
    }

}
