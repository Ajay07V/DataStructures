package dsa.linkedList;

import java.util.LinkedList;

public class LinkedListCustom {
    private Node start;

    public static void main(String[] args) {
        LinkedListCustom list = new LinkedListCustom();
        list.append(10);
        list.append(20);
        list.append(30);
        list.printList();
    }

    private void printList() {
        Node current = start;
        while (current != null) {
            System.out.print(current.getData() + " -> ");
            current = current.getNextNode();
        }
        System.out.println("null");
    }

    private void append(int data) {
        if (start == null) {
            start = new Node(data);
            System.out.println("start " + start);
        } else {
            //start from head by iterating
            Node current = start;
            //iterate until nextNode(address) is null
            while (current.nextNode != null) {
                //get next node address and store it in current
                current = current.nextNode;
            }
            Node newNode = new Node(data);
            current.nextNode = newNode;
        }

    }
}

class Node {
    int data;
    Node nextNode;

    Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    /*public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }*/

    public Node getNextNode() {
        return nextNode;
    }
}
