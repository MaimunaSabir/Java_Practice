public class LinkedListReverse {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    
    void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

   
    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

   
    void reverseList() {
        if (head == null || head.next == null) {
            System.out.println("Already reversed");
            return;
        }

        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }

    public static void main(String[] args) {
        LinkedListReverse list = new LinkedListReverse();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        System.out.println("Original List:");
        list.printList();

        list.reverseList();

        System.out.println("Reversed List:");
        list.printList();
    }
}