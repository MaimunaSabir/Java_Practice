public class CircularLinkedList {
    Node head;
    Node tail;
    int size;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            size++;
        }
    }

    // Iterator class
    class Iterator {
        Node curr;

        Iterator(Node n) {
            curr = n;
        }

        void next() {
            curr = curr.next;
        }

        int getData() {
            return curr.data;
        }

        void addAfter(int data) {
            Node newNode = new Node(data);
            newNode.next = curr.next;
            curr.next = newNode;
            if (curr == tail) {
                tail = newNode;
            }
        }

        void removeAfter() {
            if (curr.next == head) {
                removeFirst();
            } else {
                curr.next = curr.next.next;
            }
        }
    }

    // ADD FIRST
    void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
            return;
        }
        newNode.next = head;
        head = newNode;
        tail.next = head;
    }

    // ADD LAST
    void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        tail.next = head;
    }

    // ADD AT INDEX
    void addAtIndex(int data, int idx) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        if (idx >= size) {
            addLast(data);
            return;
        }

        Node curr = head;
        for (int i = 0; i < idx - 1; i++) {
            curr = curr.next;
        }
        Node newNode = new Node(data);
        newNode.next = curr.next;
        curr.next = newNode;
    }

    // REMOVE FIRST
    void removeFirst() {
        if (head == null) return;

        size--;
        if (head == tail) { 
            head = tail = null;
            return;
        }
        head = head.next;
        tail.next = head;
    }

    // REMOVE LAST
    void removeLast() {
        if (head == null) return;

        size--;
        if (head == tail) {
            head = tail = null;
            return;
        }

        Node curr = head;
        while (curr.next != tail) {
            curr = curr.next;
        }
        curr.next = head;
        tail = curr;
    }

    // REMOVE AT INDEX
    void removeAtIndex(int idx) {
        if (idx == 0) {
            removeFirst();
            return;
        }
        if (idx >= size - 1) {
            removeLast();
            return;
        }
        Node curr = head;
        for (int i = 0; i < idx - 1; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        size--;
    }

    // PRINT LIST
    void printList() {
        if (head == null) return;

        Node curr = head;
        do {
            System.out.print(curr.data + "-->");
            curr = curr.next;
        } while (curr != head);
        System.out.println("HEAD");
    }

    
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        cll.addFirst(10);
        cll.addLast(20);
        cll.addLast(30);
        cll.addAtIndex(15, 1);

        cll.printList(); 

        cll.removeFirst();
        cll.removeLast();

        cll.printList(); 
    }
}