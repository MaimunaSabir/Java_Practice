import java.util.*;
class reverseName{

public static void reverse(String name,int index){
    if(index<0){//base condition
        return;
    }
      //kam 
    System.out.print( name.charAt(index)+"  ");

    //recursion
    reverse(name,index-1);

}



    public static void main(String [] args){

        System.out.print("Enter name U want to reverse : ");
        
        Scanner input=new Scanner(System.in);
        String name=input.nextLine();
           System.out.println("REVERSED NAME : ");
        reverse(name,name.length()-1);

        input.close();
    }
}