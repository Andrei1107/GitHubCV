package genericPartOne;

public class Box <T> {

    private T item;

    public T getItem() {
        return item;
    }


    public Box(T item) {
        this.item = item;
    }
}
