package exercies;


/*
Given an array of equal-length strings,
 you'd like to know if it's possible to rearrange
 the order of the elements in such a way that each
  consecutive pair of strings differ by exactly one character.
  Return true if it's possible, and false if not.

Note: You're only rearranging the order of the strings, not the order of the letters within the strings!
 */

public class StringRearrangement {


    public static void main(String[] args) {

        String[] input = {"aba",
                "bbb",
                "bab"};

        System.out.println(stringsRearrangement(input));

    }

    static boolean stringsRearrangement(String[] inputArray) {
        int[] chars = new int[26];
        char[] letters = new char[26];
        int sum = 0;
        int length = chars.length;
        String s = "";

        for (String z : inputArray) {
            s += z;

        }
        letters = s.toCharArray();

        for (int i = 0; i < letters.length; i++) {

            chars[letters[i] - 'a']++;

        }

        for (int i = 0; i < chars.length; i++) {
            sum += chars[i];
        }

        if(inputArray.length<=2){
            return false;
        }





        if (sum % inputArray.length == 0 ) {
            return true;
        } else {
            return false;
        }


    }


}
