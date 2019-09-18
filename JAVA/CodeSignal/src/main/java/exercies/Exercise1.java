package exercies;

public class Exercise1 {
    /*
Given a string s consisting of small English letters,
 find and return the first instance of a non-repeating character in it.
 If there is no such character, return '_'.

     */


    public static void main(String[] args) {
//compare every character with next and return false if this exist twice

String str="abacabacdd";
firstNotRepeatingCharacter(str);


        System.out.println(firstNotRepeatingCharacter(str));

        String output="\"_\"";








    }


    public static String firstNotRepeatingCharacter(String s) {

        final int NO_OF_CHARACTERS = 256;


        char count[] = new char[NO_OF_CHARACTERS];


        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;

        }
        int index = -1;
String result;

        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i)] == 1) {
                index = i;
result= String.valueOf(s.charAt(index));
return result;
            }
        }

        return "\""+"_"+"\"";
    }


}
