package shop;

public class ShoppingCart {


    private Product[] products;
    int capacitate = 5;
    int volum;

    public ShoppingCart() {
        this.volum = 0;
        this.products = new Product[capacitate];
    }


    public void addProduct(Product product) {

        if (volum < capacitate) {
            this.products[this.volum] = product;
            volum++;

        } else {
            System.out.println("Cosul este plin sau nu mai ai bani");
        }
        System.out.println("Am adaugat " + product.getName() + " in cos");


    }


    public void showProducs() {
        for (int i = 0; i < volum; i++) {

            System.out.println(products[i].getName());


        }


    }

    public Product[] getProducts() {
        return products;
    }

    public int getCapacitate() {
        return capacitate;
    }

    public int getVolum() {
        return volum;
    }

    public double totalPrice() {

        double total = 0;
        for (int i = 0; i < volum; i++) {
            total += products[i].getPrice();

        }

        System.out.print("(metoda din clasa ShoppingCart)Suma totala a cosului este :");
        return total;

    }


    public boolean contains(Product product) {
        for (int i = 0; i < volum; i++) {
            if (products[i] == product) {
                return true;
            }
        }


        return false;
    }




}




