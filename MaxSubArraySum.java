public class Main {
	public static void main(String[] args) {
		int arr[]={-2,1,-3,4,-1,2,1,-5,4};
		
		int maxSum=arr[0];
	
		for(int i=0;i<arr.length;i++){
				int currSum=0;
			for(int j=i;j<arr.length;j++){
				currSum=currSum+arr[j];
				if(currSum>maxSum){
					maxSum=currSum;
				}
			}
		}
		System.out.println(maxSum);
	}
}