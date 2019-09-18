package multithreading;

import com.sun.org.apache.bcel.internal.generic.GOTO;

public class Bench {

    private int availableSeats;

    public Bench(int seats) {
        this.availableSeats = seats;

    }


    public synchronized void takePlace() {
        if (availableSeats > 0) {
            System.out.println("Take a seat");
            availableSeats--;

            System.out.println("There are only " + availableSeats + " seats available");

        } else {
            System.out.println("There is no seats available");
        }


    }


}
