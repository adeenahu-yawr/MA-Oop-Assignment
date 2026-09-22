// Parent class
class Animal {
    String name = "Animal";

    void eat() {
        System.out.println(name + " is eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Child class - inherits from Animal
class Cat extends Animal {
    Cat() {
        name = "Cat";
    }

    void meow() {
        System.out.println(name + " is meowing.");
    }
}

public class AnimalCat {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();     // inherited method
        c.sleep();   // inherited method
        c.meow();    // own method
    }
}
