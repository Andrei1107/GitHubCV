package linkedList;

public class Node {

    String data;

    Node nextNode;


    public Node(String data) {

        this.data = data;
        this.nextNode = null;
    }


    public String getData() {

        return data;

    }


    public void setData(String data) {

        this.data = data;

    }
}
