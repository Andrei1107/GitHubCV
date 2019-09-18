package exercies;

import java.util.Arrays;

public class AdiacentElementProduct {

    /*
Given an array of integers,
find the pair adjacent  elements that has the largest product and return that product.

 */
    public static void main(String[] args) {

        int[] inputArray = {-23, 4, -3, 8, -12};

        System.out.println( adjacentElementsProduct(inputArray));

    }

    static int adjacentElementsProduct(int[] inputArray) {

        int[] products = new int[inputArray.length-1];


        for (int i = 0; i < inputArray.length; i++) {

            for (int j = i + 1; j < i + 2; j++) {
               if (j <= inputArray.length - 1) {
                    products[i] = inputArray[i] * inputArray[j];

                }
            }
        }

        int max = Arrays.stream(products).max().getAsInt();

        return max;
    }


}
