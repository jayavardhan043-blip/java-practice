import java.util.Scanner;

class Product {
    int id;
    String name;
    float price;
}

public class ProductListEx {

    public static void main(String[] args) {
        Product[] products = new Product[2];

        Product pro1 = new Product();
        pro1.id = 2;
        pro1.name = "Nokia 6";
        pro1.price = 7000.50f;

        Product pro2 = new Product();
        pro2.id = 4;
        pro2.name = "Samsung";
        pro2.price = 9000.50f;

        products[0] = pro1;
        products[1] = pro2;

        printProducts(products);

        products = getProductsFromUser();
        printProducts(products);
    }

    private static Product[] getProductsFromUser() {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[2];

        for (int i = 0; i < 2; i++) {
            Product pro = new Product();
            System.out.println("Enter product Id:");
            pro.id = scanner.nextInt();
            System.out.println("Enter product Name:");
            pro.name = scanner.next();
            System.out.println("Enter product Price:");
            pro.price = scanner.nextFloat();
            products[i] = pro;
        }

        scanner.close();
        return products;
    }

    private static void printProducts(Product[] products) {
        for (Product product : products) {
            System.out.println(product.id + " " + product.name + " " + product.price);
        }
    }
}