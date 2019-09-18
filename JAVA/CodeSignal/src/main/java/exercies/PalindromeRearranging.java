package exercies;


/*
Given a string, find out if its characters can be rearranged to form a palindrome.
 */

public class PalindromeRearranging {


    public static void main(String[] args) {

        String input = "z";
        System.out.println(palindromeRearranging(input));
    }

    static boolean palindromeRearranging(String inputString) {


        int[] count = new int[100];
        char a = 'a';
        int par = 0;
        int impar = 0;
        int[] finalCount = new int[100];
        int k = 0;

        for (int i = 0; i < inputString.length(); i++) {

            count[inputString.charAt(i) - a]++;

        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {

                finalCount[k] = count[i];
                k++;
            }
        }


        for (int i = 0; i < k; i++) {
            if (finalCount[i] % 2 == 0) {
                par++;
            } else if (finalCount[i] % 2 != 0) {
                impar++;
            }

        }

        return impar <= 1;
    }


}
