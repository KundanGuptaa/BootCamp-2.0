class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;
    Node tail;

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void replaceAtTargetIndex(int targetIndex, int newValue) {
        Node current = head;
        int count = 0;

        while (current != null) {
            if (count == targetIndex) {
                current.data = newValue;
                System.out.println("Value replaced successfully at index " + targetIndex);
                return;
            }
            count++;
            current = current.next;
        }

        System.out.println("Target index " + targetIndex + " out of bounds. No replacement made.");
    }

    public void printList() {
        Node current = head;
        if (current == null) {
            System.out.println("The list is empty.");
            return;
        }

        System.out.print("Current List: ");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        // 1. Create doubly linked List
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        list.append(50);
        System.out.println("Original List:");
        list.printList();
        System.out.println("--------------------------------");
        int targetIndex = 2;
        int newValue = 99;
        list.replaceAtTargetIndex(targetIndex, newValue);
        System.out.println("--------------------------------");
        System.out.println("Updated List:");
        list.printList();
    }
}
