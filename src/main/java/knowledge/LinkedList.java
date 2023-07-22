package knowledge;

import org.w3c.dom.Node;
import java.io.*;

//Similar to arrays, Linked Lists are a linear data structure.
//Linked list elements are not stored at the contiguous location, the  elements are linked using pointers
//LinkedList can be represented as a class and a Node as a separate class.

public class LinkedList {
    Node head;

    //1. Create Node class - need this to represent each element in the linked list
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //2. Create LinkedList class - create this to manage the nodes and perform various operations
    public LinkedList() {
        this.head = null;
    }

    //3. Insert at beginning of the list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    //4. Insert at end of the list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    //5. Insert after a given node
    public void insertAfterNode(Node prevNode, int data) {
        if(prevNode == null) {
            System.out.println("Previous node can't be null");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    //6. Delete a node by its key
    public void deleteNodeByKey(int key) {
        Node current = head;
        Node prev = null;
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }
        if(current == null) {
            return;
        }
        if(prev == null) {
            head = current.next;
        }
        else {
            prev.next = current.next;
        }
    }

    //7. Search for a specific element
    public boolean search(int key) {
        Node current = head;
        while(current != null) {
            if(current.data ==key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    //8. Display the linked list
    public void displayList() {
        Node current = head;
        while(current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        //Insert Elements
        linkedList.insertAtEnd(10);
        linkedList.insertAtEnd(20);
        linkedList.insertAtBeginning(5);
        linkedList.insertAfterNode(linkedList.head.next, 15);

        // Display the linked list
        System.out.print("Linked List: ");
        linkedList.displayList();

        // Search for an element
        int keyToSearch = 15;
        if (linkedList.search(keyToSearch)) {
            System.out.println(keyToSearch + " is present in the linked list.");
        } else {
            System.out.println(keyToSearch + " is not present in the linked list.");
        }

        // Delete an element from the linked list
        int keyToDelete = 20;
        linkedList.deleteNodeByKey(keyToDelete);

        // Display the updated linked list
        System.out.print("Updated Linked List: ");
        linkedList.displayList();
    }
}
