package org.imhui.java.core.classtype;

/**
 * @author: imhuis
 * @date: 2022/10/2
 * @description:
 */
public class AnimalTest {
    public static void main(String[] args) {

        // 实例化静态成员类
        Animal.Dog dog = new Animal.Dog("Ani");
        dog.wow();

        // 实例化非静态成员类
        Animal animal = new Animal();
        Animal.Monkey monkey = animal.new Monkey();

    }
}

class
Animal {

    abstract static class DD {

    }

    class DDD extends DD {

    }

    static class Dog {
        private String name;

        public Dog(String name) {
            this.name = name;
        }

        protected void wow() {
            System.out.println("Wow!!");
        }
    }

    class Monkey{

    }

}
