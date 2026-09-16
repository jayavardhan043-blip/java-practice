class Calculator {
    void add (int a, int b) {
        System.out.println ("Sum:" + (a + b));
    }

    void add (int a, int b, int c) {
        System.out.println ("Sum:" + (a + b + c));
    }

    void add (double a, double b) {
        System.out.println ("Sum:" + (a + b));
    }
}

public class MethodOverloading {
    public static void main (String args[]) {
        Calculator c = new Calculator();
        c.add(10, 20);
        c.add(10, 20, 30);
        c.add(10.5, 20.5);
    }
}