package vendingMachine;

import products.Product;

import java.util.ArrayList;

public class Drawer {

    private Code code;
    private ArrayList<Product> products;

    public Drawer(Code code, ArrayList<Product> product) {
        this.code = code;
        this.products = product;
    }

    public Code getCode() {
        return this.code;
    }

    public int getProductNumbers() {
        return products.size();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public Product returnProduct() {
        return this.products.remove(0);
    }

    public double getProductPrice(){
        Product product = this.products.get(0);
        return product.getPrice();
    }
}
