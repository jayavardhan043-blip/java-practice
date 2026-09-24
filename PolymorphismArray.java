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

public class PolymorphismArray {

    public static void main(String[] args) {

        Animal[] animals = {
            new Dog(),
            new Cat(),
            new Cow()
        };

        for (Animal animal : animals) {

            animal.sound();
        }
    }
}