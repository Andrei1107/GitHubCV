package exercitii;

import java.util.Scanner;

public class Exercitii2 {

    public static void main(String[] args) {
        //invertWords();

        // countNumbers();

        // week();

        //rightAngle();


    }


    public static void invertWords() {

        String pahar1 = "Bere";
        String pahar2 = "Vin";
        String pahar3;

        System.out.println("Paharul unu are " + pahar1 + " si paharul 2 are " + pahar2);

        pahar3 = pahar1;
        pahar1 = pahar2;
        pahar2 = pahar3;


        System.out.println("Paharul unu are " + pahar1 + " si paharul 2 are " + pahar2);


    }

    public static void countNumbers() {

        int[] sir = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int par = 0;
        int impar = 0;

        int lenght = sir.length;

        for (int i = 0; i < lenght; i++) {
            if (sir[i] % 2 == 0) {
                par++;
            } else if (sir[i] % 2 != 0) {
                impar++;
            }

        }

        System.out.println("Sirul:");
        for (int i = 0; i < lenght; i++) {
            System.out.print(sir[i] + " ");
        }
        System.out.println();
        System.out.println("Sunt " + par + " numere pare si " + impar + " numere impare");

    }


    public static void week() {
        Scanner scanner = new Scanner(System.in);
        int a;
        String[] week = new String[8];
        week[1] = "Luni";
        week[2] = "Marti";
        week[3] = "Miercuri";
        week[4] = "Joi";
        week[5] = "Vineri";
        week[6] = "Sambata";
        week[7] = "Duminica";


        System.out.println("introduceti numarul zilei din saptamana");
        a = scanner.nextInt();
        int lenght = week.length;
        for (int i = 1; i < lenght; i++) {
            System.out.println(week[a]);
            break;
        }


    }


    public static void rightAngle() {
//Scanner scanner=new Scanner(System.in);
//int numar;
//numar=scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }


    }




}
