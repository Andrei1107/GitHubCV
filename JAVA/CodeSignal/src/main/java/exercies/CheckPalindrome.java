package exercies;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CheckPalindrome {


    /*
    Given the string, check if it is a palindrome.

     */


    public static void main(String[] args) {

        System.out.println(checkPalindrome("Ana"));


    }

    static boolean checkPalindrome(String inputString) {
        char[] result = new char[inputString.length()];
        char[] temp = inputString.toCharArray();
        int a = 0;

        for (int i = temp.length - 1; i >= 0; i--) {
            result[a++] = temp[i];

        }

        if (Arrays.equals(temp,result) || inputString.length() == 1) {
            return true;
        } else {
            return false;
        }


    }


}
