import java.util.Scanner;
public class ParkingSys {
	public static void main(String[] args) {
		
	int arr[]=new int [100];	
	int baseAddress=5000;
	int bytes=2;	
	int choise;	
	System.out.println("\t WELLCOME...");

		
do{
System.out.println("Please choose one: ");
	System.out.println("1)Park a car");
	System.out.println("2)Leave a car");
		System.out.println("3)Show memory address");
		System.out.println("4) Exit");
	
	Scanner sc=new Scanner(System.in);
	 choise=sc.nextInt();

	
			// PARK A CAR 
	if(choise==1){
		System.out.print("Which slot you want: ");
	    int slot=sc.nextInt();
	if(slot>100 || slot<0){
System.out.println("Error: Out of range");
	}
	else{
		arr[slot-1]=1;
		System.out.println("Car add at slot sucessfully");
		System.out.println();	
}
	}
	
	//LEAVE A CAR
else if(choise==2){
			System.out.print("Which slot you are leaving : ");
	    int slot=sc.nextInt();
	if(slot>100 || slot<0){
System.out.println("Error: Out of range");
	}
	else{
     arr[slot-1]=0;
   System.out.println("Car remove from slot sucessfully");
   System.out.println();
	}
}


//MEMORY ADDRESS
else if(choise==3){
			System.out.print("Which slot's memory address U want : ");
	    int slot=sc.nextInt();
	if(slot>100 || slot<0){
System.out.println("Error: Out of range");
	}
	else{
		int idx=slot-1;
         int add=baseAddress +(idx*bytes);
         System.out.println("Your slot address is: " + add);
        //    System.out.println("Process completed sucessfully");
            System.out.println();
	}
}
else if(choise==4){		
   System.out.println("\t Process completed sucessfully");
		  System.out.println("\t THANK U");
}
	
else{
 		System.out.println("Invalid number");
 }		
  // sc.close();
	}while(choise!=4);	
  
}
}