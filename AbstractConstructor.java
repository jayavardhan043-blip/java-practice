abstract class Vehicle {

    Vehicle() {
        System.out.println("Vehicle constructor called");
    }

    abstract void start();
}

class Car extends Vehicle {

    Car() {
        System.out.println("Car constructor called");
    }

    @Override
    void start() {
        System.out.println("Car starts with a key");
    }
}

public class AbstractConstructor {

    public static void main(String[] args) {

        Car car = new Car();

        car.start();
    }
}