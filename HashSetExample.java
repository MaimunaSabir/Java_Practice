import java .util.Iterator;
import java.util.HashSet;
class HashSetExample{
    public static void main(String [] args){

 HashSet <Integer> set = new HashSet<>();

     // insert
 
set.add(1);
set.add(9);
set.add(2);
set.add(10);
set.add(9);
set.add(11);
System.out.println("SET : " + set);

//  remove

set.remove (11);
System.out.println("SET after removing : " + set);


// search of boolean type

if (set.contains(11)) {
   System.out.println(" Yes, this object is present");
}
else{
      System.out.println(" No, this object is not present");

}

 // size

System.out.println("Size of SET : " + set.size());


 // iteration

Iterator  <Integer> it = set.iterator();
   System.out.print(" Object in the set are : " );
while (it.hasNext()) {
   System.out.print(it.next() + "  ");
}

 //  empty

 if (set.isEmpty()) {
   System.out.println(" \nset is empty");
 }
else{
      System.out.println(" \nset is not empty");

}
    }
}