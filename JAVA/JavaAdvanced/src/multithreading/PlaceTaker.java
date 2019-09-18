package multithreading;

public class PlaceTaker extends Thread {

    private Bench bench;


    public PlaceTaker(Bench b) {
        this.bench = b;
    }

    @Override
    public void run() {
        bench.takePlace();
    }
}
