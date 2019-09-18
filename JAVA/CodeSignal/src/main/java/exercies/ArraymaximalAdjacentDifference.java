package exercies;

/*
Given an array of integers,
find the maximal absolute difference between any two of its adjacent elements.
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraymaximalAdjacentDifference {

    public static void main(String[] args) {
        int[] inputArray = {-1, 4, 10, 3, -2};
        System.out.println(arrayMaximalAdjacentDifference(inputArray));
    }


    static int arrayMaximalAdjacentDifference(int[] inputArray) {
        int[] sums = new int[inputArray.length * 2 - 2];
        int k = 0;
        int max = 0;
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < inputArray.length - 1; i++) {
            sums[k] = inputArray[i] - inputArray[i + 1];
            lista.add(sums[k]);
            k++;

            sums[k] = inputArray[i + 1] - inputArray[i];
            lista.add(sums[k]);
            k++;
        }
        return Collections.max(lista);
    }


}
