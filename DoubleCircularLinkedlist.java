public class Main {
	Node head;
	Node tail;
	int size;

class Node{
	int data;
	Node next;
	Node prev;
	Node(int d){
		data=d;
		size++;
	}
}

//ADD FIRST
void addFirst(int data){
	Node newNode=new Node(data);
	if(head==null){
		head=tail=newNode;
		tail.next=head;
		head.prev=tail;
	}
	else{
		newNode.next=head;
		head.prev=newNode;
		head=newNode;
		head.prev=tail;
		tail.next=head;
	}
}

//ADD LAST
void addLast(int data){
	Node newNode=new Node(data);
	if(head==null){
		head=tail=newNode;
		tail.next=head;
		head.prev=tail;
	}
	else{
		tail.next=newNode;
		newNode.prev=tail;
		tail=newNode;
		tail.next=head;
		head.prev=tail;
	}
}

//ADD AT IDX
void addBtw(int data,int idx){
	Node newNode=new Node(data);
	if(idx==0){
		addFirst(data);
		return;
	}
	if(idx>=size){
		addLast(data);
		return;
	}

	Node curr=head;
	for(int i=0;i<idx-1;i++){
		curr=curr.next;
	}
	newNode.next=curr.next;
	newNode.prev=curr;
	curr.next.prev=newNode;
	curr.next=newNode;
}

//REMOVE FIRST
void removeFirst(){
	if(head==null){
		return;
	}
	size--;
	if(head==tail){
		head=null;
		tail=null;
		return;
	}
	head=head.next;
	head.prev=tail;
	tail.next=head;
}

//REMOVE LAST
void removeLast(){
	if(head==null){
		return;
	}
	size--;
	if(head==tail){
		head=null;
		tail=null;
		return;
	}
	tail=tail.prev;
	tail.next=head;
	head.prev=tail;
}

//REMOVE AT IDX
void removeBtw(int idx){
	if(idx==0){
		removeFirst();
		return;
	}
	if(idx>=size-1){
		removeLast();
		return;
	}

	Node curr=head;
	for(int i=0;i<idx-1;i++){
		curr=curr.next;
	}
	curr.next=curr.next.next;
	curr.next.prev=curr;
	size--;
}

//PRINT LIST
void printList(){
	if(head==null){
		System.out.println("List is empty");
		return;
	}
	Node curr=head;
	do{
		System.out.print(curr.data+"<->");
		curr=curr.next;
	}while(curr!=head);
	System.out.println("HEAD");
}

//PRINT SIZE
int printSize(){
	return size;
}

	public static void main(String[] args) {
		Main list=new Main();
		
		list.addFirst(10);
		list.addFirst(20);
		list.addLast(30);
		list.addBtw(25,1); //add 25 at index 1
		list.printList();
		System.out.println("Size: "+list.printSize());

		list.removeFirst();
		list.printList();

		list.removeLast();
		list.printList();

		list.removeBtw(0);
		list.printList();
		System.out.println("Size: "+list.printSize());
	}
}