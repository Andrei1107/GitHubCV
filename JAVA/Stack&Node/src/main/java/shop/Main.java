package shop;

public class Main {


    public static void main(String[] args) {

        Product p1 = new Product("milk", 10);
        Product p2 = new Product("eggs", 15);
        ShoppingCart s1 = new ShoppingCart();
        Cashier c1 = new Cashier();
        System.out.println(p1.toString());

        s1.addProduct(p1);
        s1.addProduct(p2);
        s1.addProduct(p1);

        s1.showProducs();


        System.out.println(c1.totalPrice(s1));


        System.out.println(s1.contains(p1));


    }


}
