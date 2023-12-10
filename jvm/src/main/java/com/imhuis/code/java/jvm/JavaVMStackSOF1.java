package com.imhuis.code.java.jvm;

/**
 * @author: imhuis
 * @date: 2023/7/24
 * @description: VM Args: -Xss128k
 */
public class JavaVMStackSOF1 {
    private int stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) throws Throwable {
        JavaVMStackSOF1 javaVMStackSOF1 = new JavaVMStackSOF1();
        try{
            javaVMStackSOF1.stackLeak();
        }catch (Throwable r) {
            System.out.println(javaVMStackSOF1.stackLength);
            throw r;
        }
    }
}
