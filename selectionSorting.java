import java.util.*;
class selectionSorting{
    public static void main(String [] args){

        System.out.print("How many numbers U want to enter : ");
        
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();

       int array[]=new int[size];

        System.out.println("ENTER NUMBERS : ");
       for(int i=0;i<size;i++){
        array[i]=input.nextInt();
       }

       for(int i=0;i<array.length-1;i++){
        int smallest=i;
        for(int j=i+1;j<array.length;j++){
            if(array[smallest]> array[j]){
                int temp=array[smallest];
                array[smallest]=array[j];
                array[j]=temp;
            }

        }
       }
       System.out.println("ACCENDING SORTED  NUMBERS : ");
    for(int i=0;i<array.length;i++){
System.out.print(array[i]+"  ");
    }



    for(int i=0;i<array.length-1;i++){
        int largest=i;
        for(int j=i+1;j<array.length;j++){
if(array[largest]<array[j]){
    int temp=array[largest];
    array[largest]=array[j];
    array[j]=temp;
}
System.out.println();
        }
    }
 System.out.println("DECENDING SORTED  NUMBERS : ");
for(int i=0;i<array.length;i++){
    System.out.print(array[i]+"  ");
}



    input.close();
}
}