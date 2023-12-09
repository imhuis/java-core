package org.imhui.java.core.feature.java16;

/**
 * @author: imhuis
 * @date: 2023/12/6
 * @description:
 */
public class NestedRecord {

    class A {

    }
    record Nested(int i) {
        // Nested record class
    }

    public static void main(String[] args) {
        A a = new NestedRecord().new A();
        Nested n = new Nested(1);

    }
}

record FinalFields(int i) {
    // record fields are final by default
    void tryToChange() {
//         i = 1; // Error: cannot assign a value to final variable i
    }


}
