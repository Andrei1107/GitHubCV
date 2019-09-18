import linkedList.LinkedList;
import linkedList.Node;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestLinkedList {

    @Test
    public void testAddNode() {

        LinkedList linkedLists = new LinkedList("Locomotiva");

        Node node1 = new Node("Vagon1");

        Node node2 = new Node("Vagon2");

        linkedLists.addNode(node1);

        linkedLists.addNode(node2);

        Node actual = linkedLists.getLastNode();



        Assert.assertEquals(actual, node2);

    }


    @Test

    public void testToString() {

        LinkedList linkedLists = new LinkedList("data1");

        Node node2 = new Node("data2");

        Node node3 = new Node("data3");

        linkedLists.addNode(node2);

        linkedLists.addNode(node3);

        String actual = linkedLists.toString();


        String expected = "[ data1 data2 data3 ]";

        Assert.assertEquals(actual, expected);

    }


    @Test

    public void testRemove() {

        LinkedList linkedLists = new LinkedList("First Node");

        Node node2 = new Node("Second Node");

        Node node3 = new Node("Third Node");

        linkedLists.addNode(node2);

        linkedLists.addNode(node3);

        linkedLists.removeLastNode();

        Node actual = linkedLists.getLastNode();

        Assert.assertEquals(actual, node2);

    }



    @Test
    public void removeNode(){

        LinkedList linkedList=new LinkedList("Locomotiva");
        Node node1=new Node("vagon1");
        Node node2=new Node("vagon2");
        Node node3=new Node("vagon2");

        linkedList.addNode(node1);
        linkedList.addNode(node2);
        linkedList.addNode(node3);


        System.out.println(linkedList.toString());


    }


}