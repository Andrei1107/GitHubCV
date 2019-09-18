import org.junit.Assert;
import org.junit.Test;

public class VowelCounterTest {
    Counter counter=new Counter();

    @Test
    public void to_Char_Array_TEST(){
        String input="Un string cu vocale";
        char [] transformedString=counter.transformToChar(input);
        char  actual=transformedString[0];
        char expected='U';


        //sau
       // Assert.assertEquals(expected,vowelCounter.transformToChar(input)[0]);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void count_Vowels_TEST(){
        int actual=counter.countVowels("aei");
        int expected=3;
        String errormsg="Eroare,nu functioneaza";

        Assert.assertEquals(errormsg,expected,actual);

    }


     @Test
    public void is_Vowel(){
        boolean actual=counter.isVowel('a');
        boolean expected=true;

        String errorMsg="Eroare,nu functioneaza";

        Assert.assertEquals(errorMsg,expected,actual);

     }

  @Test
     public void is_Vowel_String_Method(){
//      int index = "abc".indexOf('b');
//      char c = "abc".charAt(index);
//      System.out.println(c);
        boolean actual=counter.isVowel_String_Method('i');
        boolean expecred=true;

        Assert.assertEquals(expecred,actual);
     }

     @Test
    public void removeValue(){
        char [] sir={'1','2','3','4','5'};
        char [] exp={'1','2','3','4','0'};
        char[] actual=counter.removeValue(sir);
        char [] expected=exp;

        Assert.assertArrayEquals(expected,actual);

     }



}
