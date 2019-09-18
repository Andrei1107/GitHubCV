package genericTypes;

public class Pair <T,E>{

    private T item1;
    private E item2;

    public Pair(T persoana1, E bankAccount) {
this.item1=persoana1;
this.item2=bankAccount;

    }


//

    public T getItem1() {
        return this.item1;
    }

    public E getItem2() {
        return this.item2;
    }
}
