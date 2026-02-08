class QueueArray{

int array[];
int size;
int rear =-1;

QueueArray(int size){
    this.size=size;
    array=new int [size];
}

boolean isEmpty(){
    return rear==-1;
}

boolean isFull(){
    return rear==size-1;
}

// add
void add(int data){

    if(isFull()){
        System.out.println("already full");
        return;
    }

  rear++;
  array[rear]=data;

}

//remove

int remove(){

if(isEmpty()){
        System.out.println("already empty");
        return -1;
}

  int front=array[0];
for(int i=0;i<rear;i++){
array[i]=array[i+1];
}
rear--;

    return front;

    
}

//peek

int peek(){

if(isEmpty()){
        System.out.println("already empty");
        return -1;
}

  int front=array[0];

    return front;

    
}

public static void main(String [] args ){


QueueArray q=new QueueArray(6);
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