public class LinkedListOperations {

    Node head;
    int size;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // ADD first
    void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // ADD last
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

    // PRINT
    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    // REMOVE first
    void removeFirst() {
        if (head == null) {
            System.out.println("Already empty");
            return;
        }
        size--;
        head = head.next;
    }

    // REMOVE last
    void removeLast() {
        if (head == null) {
            System.out.println("Already empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    // SIZE
    void printSize() {
        System.out.println("Size is " + size);
    }

    // remove nth node from end
    public Node removeFromEnd(Node head, int n) {
        if (head == null) return null;

        int total = 0;
        Node current = head;
        while (current != null) {
            total++;
            current = current.next;
        }

        if (n == total) return head.next;

        int target = total - n;
        current = head;
        for (int i = 1; i < target; i++) {
            current = current.next;
        }
        if (current.next != null)
            current.next = current.next.next;

        return head;
    }

    
    public static void main(String[] args) {
        LinkedListOperations list = new LinkedListOperations();

        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(5);
        list.addFirst(7);

        list.printSize();
        list.removeFirst();
        list.removeLast();

        list.printList();

        list.head = list.removeFromEnd(list.head, 2);
        list.printList();
    }
}