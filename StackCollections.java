import java.util.*;
class StackCollection{

 static void AddAtBottom(int data,Stack <Integer>s){
 if(s.isEmpty()){
    s.push(data);
    return;
 }
int top=s.pop();
AddAtBottom(data,s);
s.push(top);

}

static void reverse(Stack <Integer>s){
if(s.isEmpty()){
    return;
 }

int top= s.pop();
reverse(s);
AddAtBottom(top,s);


}


    public static void main(String [] args){

      Stack<Integer> s= new Stack<>();

            s.push(1);
      s.push(2);
      s.push(3);
      s.push(4);
      StackCollection.reverse(s);

      while(!s.isEmpty()){
        System.out.println(s.peek());
        s.pop();
      }


    } 
}