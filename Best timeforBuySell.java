public class Main {
	public static void main(String[] args) {
		
		int price[]={1,2,5,3,6,4};
		int max=0;
		int min=price[0];
		
for(int i=1;i<price.length;i++){
	int	maxProfit=price[i]-min;
		if(maxProfit>max){
			max=maxProfit;
			}	
			
			if(min>price[i]){
		min=price[i];	
		}	

		
		}
		
				
				
	
		
System.out.print(" At the profit of "+max);
					
	}
}