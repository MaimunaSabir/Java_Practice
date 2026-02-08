import java.util.ArrayList;
import java.util.Collections;
public class OptOfArrayList{

public static void main(String [] args){
ArrayList<Integer> list = new ArrayList<Integer>();
   
//1 ADD
list.add(2);
list.add(5);
list.add(7);

//2 ADD between
list.add(0,0);
list.add(1,1);
list.add(3,3);
list.add(4,4);
list.add(6,6);

//3 remove
list.remove(7);

//4 GET 
System.out.println(list.get(4));

//5 SET
list.set(0,10);

//6 size

System.out.println(list.size());

//7 sorting

Collections.sort(list);

//ITERATIONS
for(int i=0;i<list.size();i++){
    
System.out.print(list.get(i)+" ");
}
list.add(0,90);
Collections.reverse(list);
System.out.println(list);



}
}