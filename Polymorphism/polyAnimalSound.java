class Animal2 {
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal2 {
    @Override
    void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

class Cat2 extends Animal2 {
    @Override
    void makeSound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}

public class AnimalSound {
    public static void main(String[] args) {
        Animal2 a1 = new Dog();
        Animal2 a2 = new Cat2();

        a1.makeSound();
        a2.makeSound();
    }
}
