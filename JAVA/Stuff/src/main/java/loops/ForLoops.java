package loops;

import java.util.Scanner;

public class ForLoops {

    public static void main(String[] args) {
        //rightAngleTriangle();

        // rATIncreasedbYOne();

       // pyramid();
       //chrystmassTree();



    }


    public static void rightAngleTriangle() {

        for (int i = 0; i < 10; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(j);
            }

            System.out.println("");
        }


    }

    public static void rATIncreasedbYOne() {
        int k = 1;
        for (int i = 1; i < 5; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(k++);
            }
            System.out.println("");
        }
    }


    public static void pyramid() {
        int i, j, spc, k, t = 1;

        int rows = 4;
        spc = rows + 4 - 1;

        for (i = 1; i <= rows; i++) {

            for (k = spc; k >= 1; k--) {
                System.out.print(" ");

            }
            for (j = 1; j <= i; j++) {
                System.out.print(t++ + " ");


            }
            System.out.println();
            spc--;
        }


    }


    public static void chrystmassTree() {

        int rows = 4;
        int t = 1;
        int space = 7;


        for (int i = 1; i <= 7; i++) {


            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(t++ + " ");
            }

            System.out.println();
            space--;

        }

        for (int m = 1; m <= 2; m++) {

            for (int x = 1; x < 6; x++) {
                System.out.print(" ");
            }
            for (int h = 1; h < 3; h++) {
                System.out.print(t++ + " ");
            }
            System.out.println();

        }


    }













}
