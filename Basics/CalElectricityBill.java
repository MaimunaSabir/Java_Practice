public class Main {
	public static void main(String[] args) {
	//First 100 units → Rs 5 per unit
   //Next 100 units → Rs 8 per unit
    //Above 200 units → Rs 10 per unit
    
    
    
    int units=130;
    
    
    if(units <=100){
        System.out.println("Bill is :"+ units*5);
    }
      else if(units <=200){
        int first100=100*5;
        int sec100=(units-100)*8;
        int totalBill=first100 +sec100;
        System.out.println("Bill is :"+  totalBill);
    }
     else if(units > 200){
        int first100=100*5;
        int sec100=100*8;
        int next=(units-200)*10;
        int totalBill=first100 +sec100+next;
        System.out.println("Bill is :"+  totalBill);
    }
     
    
    
    
    
    
	}
}