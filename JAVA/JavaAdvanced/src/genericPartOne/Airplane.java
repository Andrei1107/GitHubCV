package genericPartOne;

public class Airplane implements Comparable<Airplane> {


    int maxSpeed;

    public Airplane(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


    @Override
    public String toString() {
        return "Airplane";
    }

    @Override
    public int compareTo(Airplane o) {
        return this.maxSpeed - o.maxSpeed;
    }
}
