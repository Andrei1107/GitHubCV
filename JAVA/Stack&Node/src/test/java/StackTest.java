import Stack.Stack;
import org.junit.Assert;
import org.junit.Test;

public class StackTest {


@Test
    public void outOfBoundTest(){
     Stack stack=new Stack(3);
     stack.push(1);
     stack.push(2);
     stack.push(3);


     int actual=stack.pop();
     int expected=3;



   Assert.assertEquals(expected,actual);





}


}
