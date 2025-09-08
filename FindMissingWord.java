public class Main {
	public static void main(String[] args) {
		int arr[]={1,2,3,4,6,7,8};
    	int	n=arr[arr.length-1];
    	int s=0;
    	for(int i=0;i<arr.length;i++){
    		s+=arr[i];
    	}
    	
    	int sum=n*(n+1)/2;
    	int diff=sum-s;
    	System.out.print("Mixing Word is = " +diff);
		
	}
}