class Product {
    int id;
    String name;
    float price;
}

public class CallByReferenceEx {

    public static void main(String[] args) {
        Product pro = new Product();
        pro.id = 12;
        pro.name = "Nokia";
        pro.price = 3.4f;

        printProduct(pro);
        changeProductValues(pro);
        printProduct(pro);
        makeProductNull(pro);
        printProduct(pro);
    }

    private static void printProduct(Product pro) {
        if (pro != null) {
            System.out.println("printProduct() -> " + pro.id + " " + pro.name + " " + pro.price);
        } else {
            System.out.println("printProduct() -> null");
        }
    }

    private static void changeProductValues(Product pro) {
        pro.id = 14;
        pro.price = 3000.50f;
    }

    private static void makeProductNull(Product pro) {
        pro = null; // only affects local reference
    }
}