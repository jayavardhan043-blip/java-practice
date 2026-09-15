class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void run() {
        System.out.println("Dog is running");
    }
}

public class UpcastingExample {

    public static void main(String[] args) {

        Animal animal = new Dog();

        animal.sound();
    }
}