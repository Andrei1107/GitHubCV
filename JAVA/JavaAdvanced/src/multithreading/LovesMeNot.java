package multithreading;

public class LovesMeNot extends Thread {

    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println("Loves Me Not!");
        }
    }
}
