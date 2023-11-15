package org.imhui.java.core.clazz;

/**
 * @author: imhuis
 * @date: 2022/3/12
 * @description:
 */
public class Man {

    private int age = 10;

    public Man() {
    }

    public People getMan() {
          class Woman extends People {
             private int age;
             private String name;

             public Woman(int age, String name) {
                 this.age = age;
                 this.name = name;
             }

             public String getname() {
                 return name;
             }
         }
        return new Woman(age, "你好");
    }

    public static void main(String[] args) {
        Man man = new Man();
        People man1 = man.getMan();
        System.out.println();
    }
}
