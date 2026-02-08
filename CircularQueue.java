class CircularQueue{
int array[];
int size;
int rear=-1;
int front=-1;

CircularQueue(int size){
    array=new int [size];
    this.size=size;
}

boolean isEmpty(){
    return rear==-1 || front ==-1;
}

boolean isFull(){
    return (rear+1)%size==front;
}

// add
void add(int data){

    if(isFull()){
        System.out.println("already full");
        return;
    }

 rear=(rear+1)%size;
array[rear]=data;
}

//remove

int remove(){

if(isEmpty()){
        System.out.println("already empty");
        return -1;
}

if(front==rear){
front=rear=0;
}

int result=array[front];
front=(front+1)%size;
    return result;

    
}

//peek

int peek(){

if(isEmpty()){
        System.out.println("already empty");
        return -1;
}

  int result=array[front];

    return result;

    
}


    public static void main(String [] args){
        CircularQueue q=new CircularQueue(6);
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
