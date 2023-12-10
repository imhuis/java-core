package com.imhuis.code.java.learning.accessmodifiers;

/**
 * @author: imhuis
 * @date: 2023/8/6
 * @description:
 */
public class Bar {

    public void pub_abc() {
        System.out.println("Bar method: pub_abc");
    }

    public final void pub_f_abc() {
        System.out.println("Bar method: pub_f_abc");
    }

    private void pri_abc() {
        System.out.println("Bar method: pri_abc");
        // 调用本类私有方法
        pri_f_abc();
    }

    private final void pri_f_abc() {}

    protected void pro_abc() {
        System.out.println("Bar method: pro_abc");
        // 调用本类受保护方法
        pro_f_abc();
    }
    protected final void pro_f_abc() {
        System.out.println("Bar method: pro_f_abc");
    }

    void de_abc() {
        System.out.println("Bar method: de_abc");
        ccc(1);
    }

    void ccc(int i){
    }
}
