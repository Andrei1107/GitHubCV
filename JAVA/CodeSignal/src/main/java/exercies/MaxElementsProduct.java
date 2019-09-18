package exercies;

import java.util.Arrays;

public class MaxElementsProduct {

    /*
Given an array of integers,
find the pair of  elements that has the largest product and return that product.

     */

    public static void main(String[] args) {

        int [] inputArray={3,6,-2,-5,7,3};
        System.out.println(adjacentElementsProduct(inputArray));
    }

    static int adjacentElementsProduct(int[] inputArray) {
        int[] positiveNumbers = new int[inputArray.length];
        int k = 0;
        int[] products = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] > 0) {
                int element=inputArray[i];
              positiveNumbers[k]=element;
                k++;
            }
        }


        for (int i = 0; i < k; i++) {
            for (int j = i + 1; j < k; j++) {
                products[j - 1] = positiveNumbers[i] * positiveNumbers[j];
            }

        }


        int max= Arrays.stream(products).max().getAsInt();



        return max;

    }


}