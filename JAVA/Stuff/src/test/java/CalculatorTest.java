import multiplii.Exercitii;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    Calculator calculator=new Calculator();

    @Test
    public void test_For_Multiplication(){

        int actual=calculator.multiplicatio_Two_Numbers(2,3);
        int expected=5;
        String errormsg="Eroare,ceva nu merge bine!!!";

        Assert.assertEquals(errormsg,expected,actual);

    }

@Test
    public void test_For_Division(){
       int actual= calculator.division_Two_Numbers(10,2);
        int expected=5;
        Assert.assertEquals(expected,actual);
}


@Test
    public void test_For_Sum(){
        int actual=calculator.sum_Two_Numbers(10,2);
        int expected=12;

        Assert.assertEquals(expected,actual);
}

@Test
    public void test_For_Difference(){

        int actual=calculator.difference_Two_Numbers(5,4);
        int expected=1;
        Assert.assertEquals(actual,expected);

}

@Test
public void test_Prime_Number(){

        boolean actual= Exercitii.primeNumber(9);
        boolean expected=false;

        Assert.assertEquals(expected,actual);

}

@Test
public void is_Multiple_3(){
        boolean actual=Exercitii.ismultiple3(8);
        boolean expected=true;
String errormsg="Eroare,ceva nu merge bine";
        Assert.assertEquals(errormsg,expected,actual);

}



@Test
    public void reverseString(){
        String actual=Exercitii.stringReverse("Andrei");
        String expected="ierdnA";

        Assert.assertEquals(expected,actual);

}


}
