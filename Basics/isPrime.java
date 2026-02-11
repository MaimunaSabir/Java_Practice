public class Main {
	public static void main(String[] args) {
		int num=2;
		boolean isPrime=true;

	for(int i=2;i<num;i++){
			if(num%i ==0){
					isPrime=false;
				break;
		}
		}
		if(isPrime==true){
		System.out.println("The number is : Prime" );
		}
		else{
		System.out.println("The number is : Non-Prime" );
		}
			
		
		
	}
}