class Product {
    private String productName;
    private int productPrice;
    private int productQuantity;

    public void setProductName (String productName) {
        this.productName = productName;
    }

    public String getProductName () {
        return productName;
    }

    public void setProductPrice (int productPrice) {
        this.productPrice = productPrice;
}

    public int getProductPrice () {
        return productPrice;
    }

    public void setProductQuantity (int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public int getProductQuantity () {
        return productQuantity;
    }
}

public class ProductDetails {
    public static void main (String[] args) {
        Product product1 = new Product ();
        product1.setProductName ("Laptop");
        product1.setProductPrice (50000);
        product1.setProductQuantity (10);
        System.out.println ("Product name: " + product1.getProductName());
        System.out.println ("Product price: " + product1.getProductPrice());
        System.out.println ("Product quantity: " + product1.getProductQuantity());
    }
} 