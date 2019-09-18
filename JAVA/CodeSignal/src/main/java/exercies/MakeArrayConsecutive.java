package exercies;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MakeArrayConsecutive {


    /*
    Ratiorg got statues of different sizes as a present from CodeMaster for his birthday,
    each statue having an non-negative integer size. Since he likes to make things perfect,
    he wants to arrange them from smallest to largest so that each statue will be bigger than
    the previous one exactly by 1. He may need some additional statues to be able to accomplish that.
     Help him figure out the minimum number of additional statues needed.
     */


    public static void main(String[] args) {
        int[] statues = {6, 3};
        System.out.println(" \n"+makeArrayConsecutive2(statues));

    }


    static int makeArrayConsecutive2(int[] statues) {
        int temp;
        int[] giftForMaster = new int[10];
        int k = 0;

        int[] sortedStatues = Arrays.stream(statues).sorted().toArray();
        for (int i = 0; i < statues.length; i++) {
            System.out.print(" " + sortedStatues[i]);
        }

        for (int i = 0; i < sortedStatues.length; i++) {
            for (int j = i + 1; j < i + 2; j++) {
                if (j <= sortedStatues.length - 1) {
                    if (sortedStatues[j] - sortedStatues[i] == 1) {
                        continue;
                    } else if ((sortedStatues[j] - sortedStatues[i]) >= 2) {
                        giftForMaster[k] = sortedStatues[j] - sortedStatues[i] - 1;
                        k++;
                    }
                }

            }
        }

        int sum=0;
        for(int i=0;i<=k;i++){

           sum+=giftForMaster[i];
        }

        return sum;

    }


}
