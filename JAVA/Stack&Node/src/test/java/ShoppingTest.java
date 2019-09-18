import org.junit.Assert;
import org.junit.Test;
import shop.Product;
import shop.ShoppingCart;

public class ShoppingTest {



    @Test
    public void shoopingAddTest(){

        ShoppingCart s1=new ShoppingCart();
        Product p1=new Product("Branza",10);
        s1.addProduct(p1);

       Product [] allProducts=s1.getProducts();
        String expected=p1.getName();
        double expected2=p1.getPrice();

       Product actualProduct=allProducts[0];


  Assert.assertEquals(expected,actualProduct.getName());
  Assert.assertEquals(expected2,actualProduct.getPrice(),0);



    }


    @Test
    public void containsShopTest(){

        ShoppingCart s1=new ShoppingCart();
        Product p1=new Product("Potato",15);
        Product p2=new Product("Onion",10);
        Product p3=new Product("Tomato",5);
        Product p4=new Product("HotDog",9);
        s1.addProduct(p1);
        s1.addProduct(p2);
        s1.addProduct(p3);
s1.addProduct(p4);

        boolean actual=s1.contains(p4);
        boolean expected=true;


       Assert.assertEquals(expected,actual);

//sau
       // Assert.assertTrue(true);





    }




}
