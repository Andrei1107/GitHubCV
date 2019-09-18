package linkedList;

public class LinkedList {

    //lista simplu inlantuita    O->O->O

    //lista multi inlantuita    O<->O<->O

    // nu folosim index aici

    //nu fel arrays

    private Node first;


    public LinkedList(String data) {

        Node firstNode = new Node(data);

        this.first = firstNode;

    }


    public void addNode(Node node) {

        Node next = first;

        while (next.nextNode != null) {

            next = next.nextNode;

        }

        next.nextNode = node;

    }


    public Node getFirst() {

        return first;

    }


    public Node getLastNode() {

        Node next = first;

        while (next.nextNode != null) {

            next = next.nextNode;

        }

        return next;

    }


//    public String toString() {
//
//        StringBuilder sb = new StringBuilder();
//
//        Node next = first;
//
//        sb.append("[ ");
//
//        while (next.nextNode != null) {
//
//            sb.append(next.data + " ");
//
//            next = next.nextNode;
//
//        }
//
//
//        sb.append(getLastNode().data + " ]");
//
//        return sb.toString();
//
//    }
    @Override
   public String toString(){

        return first.data+" -> next: "+first.nextNode.getData();
    }


    public void removeLastNode() {

        Node next = first;

        while (next.nextNode.nextNode != null) {

            next = next.nextNode;

        }

        next = null;

    }


    public void removeNode(Node node){
        Node current=first;



        while(current.nextNode != node && current != null){

            current.nextNode=node;

        }
        current.nextNode=node.nextNode;

    }



}
