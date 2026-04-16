import java.util.Scanner;
public class isLeap {
	public static void main(String[] args) {
		System.out.println("Enter a year : ");
	Scanner input=new Scanner(System.in);
	int year=input.nextInt();
	
	if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
		System.out.println("This year is a leap year ");
	}
	else{
		System.out.println("This year is not a leap year ");	
}		
	
		
	}
}