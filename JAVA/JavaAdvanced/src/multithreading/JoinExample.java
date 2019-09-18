package multithreading;

public class JoinExample extends Thread {
    @Override
    public void run() {
        System.out.println("Sunt in threadul "+Thread.currentThread().getName());


    }


}
