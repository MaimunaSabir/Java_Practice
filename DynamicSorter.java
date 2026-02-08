import java.util.*;
class sorting{
    public static void main(String [] args){

        System.out.print("How many numbers U want to enter : ");
        
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();

       int array[]=new int[size];

        System.out.println("ENTER NUMBERS : ");
       for(int i=0;i<size;i++){
        array[i]=input.nextInt();
       }

String option;

do{

  System.out.print("In which order U want if Accending type (A) if decending type (D) AND type (stop) to exit : ");
option=input.next();

if(option.equalsIgnoreCase("D")){
         System.out.print("SORTED ARRAY in decending order : ");

for(int i=0;i<array.length-1;i++){
 for(int j=0;j<array.length-i-1;j++){
 if(array[j]<array[j+1]){
            int temp=array[j];
            array[j]=array[j+1];
            array[j+1]=temp;

 }
 }
}
 for(int k=0;k<array.length;k++){
   System.out.print(array[k]+"  ");
 }
 System.out.println();
}

else if(option.equalsIgnoreCase("A")){


     System.out.print("SORTED ARRAY in accending order  : ");

for(int i=0;i<array.length-1;i++){
 for(int j=0;j<array.length-i-1;j++){
 if(array[j]>array[j+1]){
            int temp=array[j];
            array[j]=array[j+1];
            array[j+1]=temp;

 }
 }
}
 for(int k=0;k<array.length;k++){
   System.out.print(array[k]+"  ");
 }
System.out.println();
}


}while(!option.equalsIgnoreCase("stop"));

 input.close();
System.out.print("PROCESS COMPLETE");}   


}



