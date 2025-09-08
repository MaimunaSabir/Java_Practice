public class Main {
	
public static void  binary(int start,int end,int arr[],int tar){

	 int mid=start+(end-start)/2;
		
		if(tar==arr[mid]){
			System.out.print("Found at idx = "+mid);
		}
			if(start>=end){
			System.out.print("Index Not Found");
		}
		
		if(arr[mid]>tar){
				binary(start,mid-1,arr,tar);
		}
					
		if(arr[mid]<tar){
				binary(mid+1,arr.length-1,arr,tar);
		}
					
						
							
					}	
	
	
	public static void main(String[] args) {
		int arr[]={1,3,5,7,9};
        int	tar=7;
        int  start=0;
        int end=arr.length-1;
        
        Main.binary(start,end,arr,tar);
        
        
        
	}
}