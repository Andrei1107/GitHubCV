package exercies;

public class AreSimilar {

    /*
    Two arrays are called similar if one can be
    obtained from another by swapping at most one pair of elements in one of the arrays.

Given two arrays a and b, check whether they are similar
     */

    public static void main(String[] args) {
        int[] a = {4, 6, 3};
        int[] b = {6, 4, 3};
        System.out.println(areSimilar(a, b));

    }


    static boolean areSimilar(int[] a, int[] b) {

            int rs = 0, s1 = 1, s2 = 1;
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i])
                    rs++;
                s1 *= a[i];
                s2 *= b[i];
            }
            return rs <= 2 && s1 == s2;
        }





    }







