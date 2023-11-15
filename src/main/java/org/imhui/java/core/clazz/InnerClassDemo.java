package org.imhui.java.core.clazz;

/**
 * @author: imhuis
 * @date: 2022/10/1
 * @description:
 */
public class InnerClassDemo {

    abstract static class Inner1 {
        private String name;
        private String key;

        public Inner1(String name, String key) {
            this.name = name;
            this.key = key;
        }
    }


    public DoingInt getMan(String abc) {

        return new DoingInt() {
            private String a = abc;

            @Override
            public String doing() {
                return a + "anc";
            }
        };
    }

    public Person getSs() {
        class Ss implements Person {

        }
        return new Ss();
    }

    public static void main(String[] args) {
        InnerClassDemo innerClass = new InnerClassDemo();
        DoingInt abc = innerClass.getMan("abc");
        System.out.println(abc.doing());
    }
}
