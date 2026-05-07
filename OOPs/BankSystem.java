class Bank{
	int amount;
	
    Bank(int a){
       	amount=a;
     }
     
  int deposit(int money){
  	 amount=amount+money;
  	 return amount;
  }
  
  
  int withDraw(int money){
  	if(amount<money){
  		System.out.println("InSufficient balance");
  		return 0;
  	}
  	else{
  		amount=amount-money;
  		return amount;
  	}
}


void checkBalance(){
	System.out.println("Ur balance is : " + amount);
}




}


public class Main {
	public static void main(String[] args) {
		Bank b1=new Bank(5000);
		b1.deposit(100);
		b1.withDraw(600);
		b1.checkBalance();
	}
}