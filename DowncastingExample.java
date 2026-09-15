class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

public class DowncastingExample {

    public static void main(String[] args) {

        Animal animal = new Dog();

        Dog dog = (Dog) animal;

        dog.bark();
    }
}