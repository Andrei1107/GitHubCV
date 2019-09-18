package exercies;

public class AlternatingSums {

    /*
    Several people are standing in a row and need to be divided into two teams.
     The first person goes into team 1,
      the second goes into team 2, the third goes into team 1 again,
       the fourth into team 2, and so on.

You are given an array of positive integers -
 the weights of the people. Return an array of two integers,
 where the first element is the total weight of team 1,
  and the second element is the total weight of team 2 after the division is complete.

     */


    public static void main(String[] args) {
        int[] people = {50, 60, 60, 45, 70};
        alternatingSums(people);
    }

    static int[] alternatingSums(int[] a) {
        int team1 = 0;
        int team2 = 0;
        int[] finalTeam = new int[2];
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                team1 += a[i];
            } else if (i % 2 != 0) {
                team2 += a[i];
            }

        }

        int k = 0;
        for (int i = 0; i < 1; i++) {
            finalTeam[k] += team1;
            k++;
            finalTeam[k] += team2;
        }


        return finalTeam;
    }


}
