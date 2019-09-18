import org.junit.Assert;
import org.junit.Test;
import shop.Cashier;
import shop.Product;
import shop.ShoppingCart;

public class CashierTest {


    @Test
    public void testShoppingCart(){

        ShoppingCart shoppingCart=new ShoppingCart();

        shoppingCart.addProduct(new Product("milk",10));
        shoppingCart.addProduct(new Product("cheese",20));

        Cashier cashier=new Cashier();

        double actual=cashier.totalPrice(shoppingCart);
        double expected=30;

        Assert.assertEquals(expected,actual,2);

    }

}
