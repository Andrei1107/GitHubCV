package Stack;

//LIFO=last in first out

public class Stack {


    private int[] stackData;
    private int topStack;
    private int size2;

    public Stack(int size) {

        topStack = 0;
        size2 = size;
        this.stackData = new int[size];

    }

    public int getTopStack() {
        return topStack;
    }

    public void push(int element) {

        if (topStack < size2) {
            stackData[topStack] = element;
            topStack++;

        } else {
            System.out.println("Stak is full!!!");
        }
    }

    public int[] getStackData() {
        return stackData;
    }

    public void displayStack() {

        for (int i = 0; i < topStack; i++) {
            System.out.println(stackData[i]);
        }

    }


    public int pop() {
        int lastElement;
        lastElement = stackData[topStack - 1];
        stackData[topStack - 1] = 0;

        return lastElement;


    }


}
