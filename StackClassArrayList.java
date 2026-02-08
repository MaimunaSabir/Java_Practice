import java.util.*;
class StackClassArrayList{

ArrayList <Integer> list= new ArrayList<>();


// empty
boolean isEmpty(){
    return list.size()==0;
}

//push

void push(int data){
    list.add(data);
}

// pop
int pop(){

    if (isEmpty()){
        System.out.println("ALready emoty");
        return -1;
    }
    int top= list.get(list.size()-1);
    list.remove(list.size()-1);
    return top;
}

//peek

int peek(){

    if (isEmpty()){
        System.out.println("ALready emoty");
        return -1;
    }
    int top= list.get(list.size()-1);
    
    return top;
}




    public static void main(String [] args){

StackClassArrayList s= new StackClassArrayList ();

       s. push(1);
       s.push(2);
       s.push(3);

       while(!s.isEmpty()){
        System.out.println(s.peek());
        s.pop();
       }
    }
}