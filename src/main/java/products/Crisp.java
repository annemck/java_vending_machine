package products;

public class Crisp extends Product {

    private String flavour;

    public Crisp(String name, String brand, String flavour, double price) {
        super(name, brand, price);
        this.flavour = flavour;
    }

    public String getFlavour() {
        return flavour;
    }
}
