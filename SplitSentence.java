import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
	Scanner input=new Scanner(System.in);
		String sent=input.nextLine();
		
		String arr []=sent.split(" ");
		
		System.out.println(arr.length);
	}
}