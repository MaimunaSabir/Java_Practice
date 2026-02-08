class QueueLinkList{
Node head;
Node tail;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

boolean isEmpty(){
 return head==null;
}
// add
void add(int data){
    Node newNode=new Node(data);
    if(isEmpty()){
        head=tail=newNode;
    }

    tail.next=newNode;

    tail=newNode;
}

// revome
int remove(){

    int toremove=head.data;
    head=head.next;
    return toremove;

}

// peek
int peek(){

    
    int toremove=head.data;
   
    return toremove;
}



    public static void main(String [] args ){
    
        QueueLinkList q=new QueueLinkList();
q.add(1);
q.add(2);
q.add(3);
q.add(4);
while(!q.isEmpty()){
    System.out.println(q.peek());
    q.remove();
}
    }

}
    