package exercies;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise4 {
    /*
    Find the kth largest element in an unsorted array.
     This will be the kth largest element in sorted order, not the kth distinct element.
     */

    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 4, 3};

        kthLargestElement(nums, 2);
    }

    static int kthLargestElement(int[] nums, int k) {
        int aux;

        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {

                    swap(nums, i, j);
                }
            }
        }


        System.out.println(nums[nums.length - k]);

//1  2  3  4  5
//0  1  2  3  4

//k=2 =>4
        //
        if (k > nums.length) {
            System.out.println("Out of bound");
            return -2;
        } else {
            return nums[nums.length - k];
        }


    }


    static void swap(int[] items, int firstIndex, int secondIndex) {
        int temp = items[firstIndex];
        items[firstIndex] = items[secondIndex];
        items[secondIndex] = temp;
    }


}