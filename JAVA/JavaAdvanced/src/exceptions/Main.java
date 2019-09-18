package exceptions;

import java.io.IOException;

public class Main {


    public static void main(String[] args) {

        SumCalculator s1 = new SumCalculator();
//        s1.calculateSum(3, 5);
//        s1.calculateSum(0, 3);

        doSomethingElse();

    }

    static void doSomething() throws InvalidNumbersExceptions, IOException {
        doSomethingSomething();
        throw new InvalidNumbersExceptions("My exception");


    }



    static void doSomethingElse(){
        try {
            doSomething();
        }catch (InvalidNumbersExceptions e){
            throw new RuntimeException("My second exception");
        }catch (IOException e){
            e.printStackTrace();
        }
    }




    static void doSomethingSomething() throws IOException {
        throw new IOException();
    }


}
