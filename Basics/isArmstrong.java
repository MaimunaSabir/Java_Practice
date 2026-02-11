public class Main {
	public static void main(String[] args) {
	  int num=123;
	  int original=num;
		int count=0;
	while(num > 0){
		num=num/10;
		count++;
		
	}
	num=original;
	int sum=0;
	while(num > 0){
		double digit=num%10;
		sum+=Math.pow(digit,count);
	
		num=num/10;
	}
	if(sum==original){
	System.out.println("This number is Amstrong");
	}
	else{
			System.out.println("This number is not Amstrong");
	}
		
		
		
}
}