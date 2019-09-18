package shop;

public class Product {

    private String name;
    private double price;


    public Product(String nume, double pret) {

        this.name = nume;
        this.price = pret;

    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {

        return "Shop.Product{" +
                "name= " + name + " " + "price= " + price + "}";

    }


}
