package exercies;

public class CommonCharacter {

    /*
    Given two strings, find the number of common characters between them.
     */


    public static void main(String[] args) {
String s1="aabcc";
String s2="adcaa";

commonCharacterCount(s1,s2);
        System.out.println(commonCharacterCount(s1,s2));

    }


  static   int commonCharacterCount(String s1, String s2) {
        int[] a = new int[26],
                b = new int[26];
        for (char c: s1.toCharArray())
            a[c - 'a']++;
        //let say the current character it's 'b',this will have the value 98-a(97)=1
      //and the b will be on second position,'a'-'a'=0 =>first character from alphabet

        for (char c: s2.toCharArray())
            b[c - 'a']++;
        int s = 0;
        for (int i = 0; i < 26; ++i)
            s +=Math.min(a[i],b[i]);
        return s;

    }



}
