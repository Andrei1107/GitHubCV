package genericPartOne;

public class Ball implements Comparable {

    int size;

    public Ball(int size) {
        this.size = size;
    }


    @Override
    public String toString() {
        return "BALL";
    }

    @Override   //aici nu o suprascriu,o definesc pt ca Interfata Comparable are o metoda compareTo care te ajuta sa compari 2 obiecte ,tu definesti dupa ce sa compare
    public int compareTo(Object o) {
        Ball myBall = new Ball(0);
        if (o instanceof Ball) {
            myBall = (Ball) o;
        }

        if (this.size > myBall.size) {
            return 1;
        } else if (this.size < myBall.size) {
            return -1;
        }


        return 0;


    }


}
