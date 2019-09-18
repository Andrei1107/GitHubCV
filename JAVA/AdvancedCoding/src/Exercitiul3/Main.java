package Exercitiul3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException  {

List<Person> personList =new LinkedList<>();

        Scanner scanner=new Scanner(new File("C:\\Users\\oprea\\Desktop\\Java\\AdvancedCoding\\src\\Exercitiul3\\personalData.txt"));
        if(scanner.hasNext()){
            scanner.nextLine();
        }

        while(scanner.hasNext()){
            String line=scanner.nextLine();
            String [] tokens=line.split(" ");
            if(tokens.length != 4){
                System.err.println("Bad input format.Abording...");
                return;
            }

            Person person=new Person(tokens[0],tokens[1],Integer.parseInt(tokens[2]));
            personList.add(person);


        }


        System.out.println(personList);
        




}



    }


