package MultiplicationTable;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

//        MultiplicationTable();
//        Suma(2, 3);
//        Diferenta(4, 5);
//        Inmultire(5, 5);
//        Impartire(10, 2);
//
//
//        System.out.println("Suma este" + Suma(2, 2));
//        System.out.println("Diferenta este " + Diferenta(4, 5));
//        System.out.println("Inmultirea este " + Inmultire(5, 6));
//        System.out.println("Impartirea este " + Impartire(9, 2));

        // SearchedValue();
//Max_Value();

    }


    public static void MultiplicationTable() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Tabla inmultirii cu :");

        int b = scan.nextInt();

        int rezultat;

        for (int i = 1; i <= 10; i++) {

            rezultat = i * b;
            System.out.println(b + "*" + i + "=" + rezultat);

        }


    }


    public static int Diferenta(int a, int b) {

        int rezultat;


        rezultat = a - b;


        return rezultat;
    }

    public static int Suma(int a, int b) {
        int rezultat;

        rezultat = a + b;

        return rezultat;


    }


    public static float Impartire(int a, int b) {
        int rezultat;


        rezultat = a / b;

        return rezultat;

    }

    public static int Inmultire(int a, int b) {
        int rezultat;


        rezultat = a * b;


        return rezultat;
    }


    public static void SearchedValue() {
        int m, n;
        int valoare;
        int exista = 0;
        int nuexista = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nr. linii:");
        m = scanner.nextInt();
        System.out.println("Nr. coloane");
        n = scanner.nextInt();
        int[][] v = new int[10][10];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print("v[" + i + "][" + j + "]=");
                v[i][j] = scanner.nextInt();


            }
        }


        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {


                System.out.print(v[i][j] + " " + " ");


            }
            System.out.println();


        }

        System.out.print("Valoarea cautata:");
        valoare = scanner.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (valoare == v[i][j]) {
                    exista++;
                } else {
                    nuexista++;
                }

            }
        }

        if (exista > 0) {
            System.out.println("Exista");
        } else if (nuexista > 0) {
            System.out.println("Nu exista");
        }

        System.out.println("valoarea " + exista + " exista de " + exista + " ori");


    }

    public static void Max_Value() {

        System.out.println(Integer.MAX_VALUE+1);//daca adaug 1 la valoarea maxima o ia de la capatul intervalului


    }







}
