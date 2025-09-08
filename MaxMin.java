public class Main {
	
public static void max(int arr[]){

       	int max=arr[0];
		for(int i=1;i<arr.length;i++){
		 
          if(max<arr[i])    
          {
      max=arr[i];
          }
		}
          System.out.println(max)    ;
                  
    
  
				
	}
	
	
public static	void min(int arr[]){
	int min=arr[0];
		for(int i=1;i<arr.length;i++){
          if(min>arr[i])    
          {
      
      min=arr[i];
      
          }
		}
      System.out.println(min)    ;
        
       
	}
	
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
	
		Main.min(arr);
		Main.max(arr);	
		
	}
}