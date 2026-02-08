// Linked List
// push,peek,pop

class StackClass{
Node head;
  
class Node{

        int data;
        Node next;
Node (int data){

    this.data=data;
    this.next=null;

}
}

//Empty
boolean isEmpty(){
    return head==null;
}

//  push
void push(int data){
Node newNode=new Node(data);

    if(isEmpty()){
        head=newNode;
        return;
    }

    newNode.next=head;
    head=newNode;
}

//pop
int pop(){

 if(isEmpty()){
    
        return -1;
    }

    int top=head.data;
    head=head.next;
    return top;


}

// peak

int peek(){

if(isEmpty()){
    
        return -1; 
    }

    int top=head.data;
    return top;


}



    

    public static void main(String [] args){
StackClass s=new StackClass();

    
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);// 4 3 2 1
    while(!s.isEmpty()){
        System.out.print(s.peek());
        s.pop();
    }



    }
}