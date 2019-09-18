package recursivitate;


import java.util.Scanner;

public class Evercitii {

    public static void main(String[] args) {
        // System.out.println(sum(5));

        // System.out.println(fibonacci(7));

        // System.out.println(fiboNerecursiv(8));

//        sortNerecursiv();
//        System.out.println();
//        gridMatrix();

        reverse();


    }


    //suma nr de la 1 la N
    public static int sum(int n) {
        int sum = 0;

        if (n != 0) {
            return n + sum(n - 1);
        }


        return sum;
        //toate numerele pana la n sunt stocate in STACk(STIVA),dupa el le aduna din stack si returneaza
    }


    static int fibonacci(int x) {


        if (x == 0 || x == 1) {
            return x;

        }
        if (x < 0) {
            return 0;

        }

        return fibonacci(x - 1) + fibonacci(x - 2);

    }


    static int fiboNerecursiv(int n) {
        int first = 0;
        int second = 1;
        int third = 0;

        if (n == first || n == second) {
            return n;

        }

        while (n >= 2) {
            third = first + second;
            first = second;
            second = third;
            n--;

        }


        return third;
    }


    static void sortNerecursiv() {
        int[] input = {5, 4, 7, 9, 3, 6, 1};
        int sort;

        for (int i = 0; i < input.length; i++) {

            for (int j = 0; j < input.length - 1; j++)

                if (input[j] > input[j + 1]) {
                    sort = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = sort;


                }


        }
        for (int g = 0; g < input.length; g++) {
            System.out.print(input[g] + " ");
        }


    }


    static void gridMatrix() {
        int m, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nr linii:");
        n = scanner.nextInt();
        System.out.println("Nr. coloane:");
        m = scanner.nextInt();

//          int [][] matric=new int[n][m];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                System.out.print("-" + " ");

            }
            System.out.println();
        }


    }
//DEBUG
    static void reverse(){
        int num;
        int r;
        int sum=0;
Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number:");
        num=scanner.nextInt();



        for(int t=num;num!=0;num=num/10){
            r=num % 10;
            sum=sum*10+r;
        }

        System.out.println(sum);

    }




}
