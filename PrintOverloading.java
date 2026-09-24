class printer {
    void print (int value) {
        System.out.println("Integer:" + value);
    }

    void print (double value) {
        System.out.println("Double:" + value);
    }

    void print (String value) {
        System.out.println("String:" + value);
    }
}

public class PrintOverloading {
    public static void main(String[] args) {
        printer printer = new printer();
        printer.print(10);
        printer.print(10.5);
        printer.print("Hello, World!");
    }
}