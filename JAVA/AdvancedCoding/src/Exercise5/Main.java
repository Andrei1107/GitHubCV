package Exercise5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

matrix();

//        char[] vector = new char[10];
//
//        for (int i = 0; i < vector.length; i++) {
//            vector[i] = '*';
//        }
//        for (int i = 0; i < vector.length; i++) {
//            System.out.print(" " + vector[i]);
//        }
//
//        for (int i = 0; i < vector.length; i++) {
//            System.out.println(vector[i]);
//        }

        System.out.println("\n\n");


        //prin stringuri

        //List este interfata

        ArrayList<String> horizontalLine = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            horizontalLine.add("* ");
        }

        AstericsHorizontal asterics=new AstericsHorizontal(horizontalLine);

        System.out.println(asterics.toString());

//sau
//        for (String p : horizontalLine) {
//            System.out.print(" " + p);
//        }

        AstericsHorizontal2 asterics2=new AstericsHorizontal2();

        for(int i=0;i<10;i++){
            asterics2.add("* ");

        }

        System.out.println(asterics2.toString());





        System.out.println("\n\n\n");

List<AstericsHorizontal2> list=new ArrayList<AstericsHorizontal2>();



//        for(int i=0;i<8;i++){
//
//            System.out.println();
//
//            for(int j=0;j<1;j++){
//                System.out.print(asterics2.toString());
//            }
//        }


        for(int i=0;i<10;i++){
           AstericsHorizontal2 astericsHorizontal2=new AstericsHorizontal2();


           for(int j=0;j<10;j++){
               astericsHorizontal2.add("* ");
           }
           list.add(astericsHorizontal2);
            System.out.println(i+astericsHorizontal2.toString());
        }

        System.out.println();
        System.out.println();
        System.out.println();

int a;
        System.out.println("Stergeti randul dorit :");
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();

        for(int i=0;i<list.size();i++){
            if(i==a){
                list.remove(i);
            }

        }

    for(AstericsHorizontal2 aH : list){
        System.out.println(aH);
    }
        System.out.println("Randul a fost sters");

        System.out.println("Stergeti coloana dorita :");
int b;
        b=scanner.nextInt();

        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.size();j++){
                if(j==b){
                    list.remove(j);
                }
            }
        }

        for(AstericsHorizontal2 aH:list){
            System.out.println(aH);
        }



//        for (int i = 0; i < vector.length; i++) {
//            System.out.println(vector[i]);
//
//
//        }
//
//        for(int i=0;i<vector.length;i++){
//            System.out.print(" "+vector[i]);
//        }



    }


    public static void matrix(){

        Matrix matrix = new Matrix();
        matrix.addLine();
        matrix.removeLine();
        matrix.removeLine();

        System.out.println("Add remove remove line: \n" + matrix.toString());


        matrix.addLine();
        matrix.addLine();
        matrix.addLine();

        matrix.addColumn();
        matrix.addColumn();
        matrix.addColumn();

        System.out.println("3 x 3 matrix: \n" + matrix.toString());

        matrix.removeColumn();

        System.out.println("After removing 1 column: \n" + matrix.toString());

        matrix.removeLine();

        System.out.println("After removing 1 line: \n" + matrix.toString());

    }

}



