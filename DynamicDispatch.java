class Animal {

    void sound() {

        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {

        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    @Override
    void sound() {

        System.out.println("Cat meows");
    }
}

class Cow extends Animal {

    @Override
    void sound() {

        System.out.println("Cow moos");
    }
}

public class DynamicDispatch {

    public static void main(String[] args) {

        Animal animal;

        animal = new Dog();
        animal.sound();

        animal = new Cat();
        animal.sound();

        animal = new Cow();
        animal.sound();
    }
}