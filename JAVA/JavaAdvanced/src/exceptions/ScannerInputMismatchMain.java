package exceptions;


import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerInputMismatchMain {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x;


        try {
            x = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input wrong ,try again");
            x = sc.nextInt();


            System.out.println(x);


        }


    }

}


