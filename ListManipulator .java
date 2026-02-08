public class Main {
    Node head;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


    // Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Print linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Search element
    public void search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                System.out.println(key + " does exist");
                return;
            }
            temp = temp.next;
        }
        System.out.println(key + " does not exist");
    }

    // Delete element
    public void delete(int key) {
        if (head == null){
 return;
}       
        if (head.data == key) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public static void main(String[] args) {
        Main list = new Main();
       
        list.insert(10);
        list.insert(51);
        list.insert(42);
        list.insert(36);
        list.insert(72);

        // Print list before deletion
        System.out.print("Linked List before deletion: ");
        list.printList();

        // Delete node with 10
        list.delete(10);

        // Print list after deletion
        System.out.print("Linked List after deletion: ");
        list.printList();
                //Search 82
        list.search(82);
    }
}
