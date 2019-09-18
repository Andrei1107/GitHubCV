package shop;

public class Cashier {

    public double totalPrice(ShoppingCart shoppingCart) {

        double total = 0;
        Product[] products = shoppingCart.getProducts();
        for (Product product : products) {
            if(product != null) {
                total += product.getPrice();
            }
        }
        return total;
    }


}
