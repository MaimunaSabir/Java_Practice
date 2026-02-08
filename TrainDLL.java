public class TrainDLL {
    Node head;
    Node tail;

class Node {
   String data;
    Node next;
    Node prev;

Node(String d){
     data = d;
        }
    }

    // ADD LAST
void addLast(String data){
  Node newNode = new Node(data);

  if(head == null){
    head = tail = newNode;
        return;
        }

     tail.next = newNode;
      newNode.prev = tail;
      tail = newNode;
    }

    // DELETE BY NAME (Remove Carriage B)
void removeByName(String name){
    if(head == null){
        return;
    }

    Node curr = head;

    while(curr != null){
       if(curr.data.equals(name)){
                
        // if deleting head
          if(curr.prev == null){
                head = curr.next;
                if(head != null){
                     head.prev = null;
             }
            }

         // if deleting tail
        else if(curr.next == null){
              tail = curr.prev;
             tail.next = null;
            }

        // middle node
       else {
          curr.prev.next = curr.next;
           curr.next.prev = curr.prev;
            }

          return;
     }
       curr = curr.next;
        }
    }

    // INSERT VIP AFTER A GIVEN CARRIAGE (After Engine)
void insertVIP(String afterName, String vip){
        Node curr = head;

        while(curr != null){
            if(curr.data.equals(afterName)){

        Node newNode = new Node(vip);

            newNode.next = curr.next;
            newNode.prev = curr;

        if(curr.next != null){
             curr.next.prev = newNode;
           }

        curr.next = newNode;

     // If inserted at end
        if(newNode.next == null){
                tail = newNode;
            }
                return;
            }
        curr = curr.next;
        }
    }

// PRINT FROM HEAD
void printHead(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + "<-->");
            curr = curr.next;
        }
        System.out.println("NULL");
    }

 public static void main(String[] args){
    TrainDLL train = new TrainDLL();

    // Initial Train
        train.addLast("Engine");
        train.addLast("Carriage A");
        train.addLast("Carriage B");
        train.addLast("Carriage C");
        train.addLast("Caboose");

        System.out.println("Train:");
        train.printHead();

        // TASK 1: Remove Carriage B
        train.removeByName("Carriage B");
        System.out.println("After Removing B:");
        train.printHead();

        // TASK 2: Insert VIP after Engine
        train.insertVIP("Engine","VIP Carriage");
        System.out.println("After Inserting VIP:");
        train.printHead();
    }
}