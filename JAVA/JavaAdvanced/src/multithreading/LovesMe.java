package multithreading;

import java.util.Random;

public class LovesMe extends  Thread {
    @Override
    public void run() {

        for(int i=0;i<100;i++){
            System.out.println("Loves Me!");


        }


    }
}
