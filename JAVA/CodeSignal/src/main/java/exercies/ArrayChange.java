package exercies;


/*
You are given an array of integers.
 On each move you are allowed to increase exactly one of its element by one.
  Find the minimal number of moves required to obtain a strictly increasing sequence from the input.
 */

public class ArrayChange {

    public static void main(String[] args) {

        int[] input = {2, 1, 10, 1};
        int[] another = {1, 1, 1};
        int[] array = {2, 3, 3, 5, 5, 5, 4, 12, 12, 10, 15};

        System.out.println(arrayChange(array));

    }

    static int arrayChange(int[] inputArray) {

        int k = 1;
        int y = 2;
        int count = 0;
        int temp = 0;


        for (int i = 0; i < inputArray.length - 1; i++) {

            if (inputArray[i] >= inputArray[i + 1]) {
                temp = inputArray[i] - inputArray[i + 1] + 1;
                inputArray[i + 1] += temp;
                count += temp;
            }


        }


        return count;
    }


}
