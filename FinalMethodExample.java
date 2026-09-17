class Parent {

    final void display() {

        System.out.println("Parent display method");
    }
}

class Child extends Parent {

    void show() {

        System.out.println("Child show method");
    }
}

public class FinalMethodExample {

    public static void main(String[] args) {

        Child child = new Child();

        child.display();
        child.show();
    }
}