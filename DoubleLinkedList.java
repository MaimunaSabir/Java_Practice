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

class Iterator{
	Node curr;
Iterator(Node n){
	curr=n;
}

void next(){
	if(curr==null){
		return;
	}
	curr=curr.next;
}

void prev(){
	if(curr==null){
		return;
	}
	curr=curr.prev;
}

int getData(){
	if(curr==null){
		return -1;
	}
	return curr.data;
}

void addAfter(int data){
    Node newNode=new Node(data);
	newNode.prev=curr;
	newNode.next=curr.next;
	if(curr.next!=null){
		curr.next.prev=newNode;
	}else{
		tail=newNode;
	}
	curr.next=newNode;
}

void AddBefore(int data){
  	Node newNode=new Node(data);
	newNode.next=curr;
	newNode.prev=curr.prev;
	if(curr.prev!=null){
		curr.prev.next=newNode;
	}else{
		head=newNode;
	}
	curr.prev=newNode;
}

void removeAfter(){
	if(curr==null || curr.next==null){
		return;
	}
	Node toDel=curr.next;
	curr.next=toDel.next;
	if(toDel.next!=null){
		toDel.next.prev=curr;
	}else{
		tail=curr;
	}
	size--;
}

void removeBefore(){
	if(curr==null || curr.prev==null){
		return;
	}
	Node toDel=curr.prev;
	curr.prev=toDel.prev;
	if(toDel.prev!=null){
		toDel.prev.next=curr;
	}else{
		head=curr;
	}
	size--;
}
}

void addFirst(int data){
	Node newNode=new Node(data);
	if(head==null){
		head=tail=newNode;
		return;
	}
	newNode.next=head;
	head.prev=newNode;
	head=newNode;
}

void addLast(int data){
	Node newNode=new Node(data);
	if(head==null){
		head=tail=newNode;
		return;
	}
	tail.next=newNode;
	newNode.prev=tail;
	tail=newNode;
}

int printSize(){
	return size;
}

void addBtw(int data,int idx){
	Node newNode=new Node(data);
	if(idx==0){
		addFirst(data);
		return;
	}
	if(idx==size){
		addLast(data);
		return;
	}
	Node curr=head;
	for(int i=0;i<idx;i++){
		curr=curr.next;
	}
	newNode.next=curr.next;
	newNode.prev=curr;
	curr.next.prev=newNode;
	curr.next=newNode;
}

void addAfterData(int data,int pos){
	Node newNode=new Node(data);
	Node curr=head;
	while(curr!=null){
		if(curr.data==pos){
			newNode.next=curr.next;
			newNode.prev=curr;
			if(curr.next!=null){
				curr.next.prev=newNode;
			}else{
				tail=newNode;
			}
			curr.next=newNode;
			return;
		}
		curr=curr.next;
	}
}

Node findMid(Node head){
	Node slow=head;
	Node fast=head;
	while(fast!=null && fast.next!=null){
		fast=fast.next.next;
		slow=slow.next;
	}
	return slow;
}

void addAtMid(int data){
	Node newNode=new Node(data);
	Node mid=findMid(head);
	newNode.next=mid.next;
	newNode.prev=mid;
	if(mid.next!=null){
		mid.next.prev=newNode;
	}else{
		tail=newNode;
	}
	mid.next=newNode;
}

void printHead(){
	Node curr=head;
	while(curr!=null){
		System.out.print(curr.data+"<-->");
		curr=curr.next;
	}
	System.out.println("NULL");
}

void printTail(){
	Node curr=tail;
	while(curr!=null){
		System.out.print(curr.data+"<-->");
		curr=curr.prev;
	}
	System.out.println("NULL");
}

void removeFirst(){
	if(head==null){
		return;
	}
	if(head.next==null){
		head=null;
		tail=null;
		size--;
		return;
	}
	head=head.next;
	head.prev=null;
	size--;
}

void removeLast(){
	if(head==null){
		return;
	}
	if(head.next==null){
		head=null;
		tail=null;
		size--;
		return;
	}
	tail=tail.prev;
	tail.next=null;
	size--;
}

void removeBtw(int idx){
	if(idx==0){
		removeFirst();
		return;
	}
	if(idx==size-1){
		removeLast();
		return;
	}
	Node curr=head;
	for(int i=0;i<idx;i++){
		curr=curr.next;
	}
	Node toDel=curr.next;
	curr.next=toDel.next;
	toDel.next.prev=curr;
	size--;
}

void removeData(int data){
	Node curr=head;
	while(curr!=null && curr.data!=data){
		curr=curr.next;
	}
	if(curr==null){
		return;
	}
	if(curr==head){
		removeFirst();
	}else if(curr==tail){
		removeLast();
	}else{
		curr.prev.next=curr.next;
		curr.next.prev=curr.prev;
		size--;
	}
}

void removeMid(){
	Node mid=findMid(head);
	if(mid==head){
		removeFirst();
	}else if(mid==tail){
		removeLast();
	}else{
		mid.prev.next=mid.next;
		mid.next.prev=mid.prev;
		size--;
	}
}

void search(int data){
	Node curr=head;
	while(curr!=null){
		if(curr.data==data){
			System.out.println("FOUND");
			return;
		}
		curr=curr.next;
	}
	System.out.println("Not FOUND");
}


	public static void main(String[] args) {
		Main list=new Main();

		list.addFirst(10);
		list.addFirst(20);
		list.addLast(30);
		list.addBtw(15,1);
		list.addAfterData(17,15);
		list.addAtMid(25);

		System.out.print("List from head: ");
		list.printHead();
		System.out.print("List from tail: ");
		list.printTail();

		list.removeFirst();
		list.removeLast();
		list.removeBtw(1);
		list.removeData(17);
		list.removeMid();

		System.out.print("After removals head: ");
		list.printHead();

		list.search(25);
		list.search(100);
		System.out.println("Size of list: "+list.printSize());

		Iterator it=list.new Iterator(list.head);
		it.next();
		it.next();
		System.out.println("Iterator current data: "+it.getData());
		it.addAfter(50);
		it.AddBefore(5);
		list.printHead();
	}
}