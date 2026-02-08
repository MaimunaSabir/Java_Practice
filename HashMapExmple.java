import java.util.*;
class HashMapExmple{

    public static void main(String [] args){

   HashMap <Integer,String> map = new HashMap<>();

   // Insert
   map.put(1,"Ayesha");
   map.put(2,"Fatima");
   map.put(3,"Noor");
map.put(4,"Rafia");
System.out.println(map);

// remove
map.remove(3);
System.out.println(map);

// search by key
if(!map.containsKey(5)){
    System.out.println(" Key is not present");
}else{
    System.out.println(" key is present");

}

// search by value
if(!map.containsValue("Maimuna")){
    System.out.println(" Value is not present");
}else{
    System.out.println(" Value is present");

}

// get--->  input=key ,output=value
System.out.println( " USe of GET method :  " + map.get(2));

// size 
System.out.println(" SIZe of map : " + map.size());

// IS EMPTY
if(map.isEmpty()){

    System.out.println(" MAP IS EMPTY");

}
else{
    System.out.println(" NOT EMpTY");
}

// iteration 

for(Map.Entry<Integer,String> m : map.entrySet()){
    System.out.println(m);
}

    }
}