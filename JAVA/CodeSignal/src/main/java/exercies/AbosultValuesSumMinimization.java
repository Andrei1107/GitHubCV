package exercies;


/*
Given a sorted array of integers a, your task is to determine
which element of a is closest to all other values of a.
In other words, find the element x in a, which minimizes the following sum:
 */


import java.util.*;

public class AbosultValuesSumMinimization {

    public static void main(String[] args) {
        int[] input = {-4, -1};
        System.out.println(absoluteValuesSumMinimization(input));

    }


    static int absoluteValuesSumMinimization(int[] a) {

        int sum = 0;
        int result = 0;
        int temp = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            sum = 0;
            for (int j = 0; j < a.length; j++) {
                sum += Math.abs(a[j] - a[i]);
            }
            if (sum < temp) {
                result = a[i];
                temp = sum;
            }

        }


        return result;
    }

}
