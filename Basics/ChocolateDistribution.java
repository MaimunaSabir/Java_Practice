public class Main {
	public static void main(String[] args) {
		int arr []={4,56,12,3,2,7,9};
		int m=5;
		
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int tem=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tem;
				}
			}
		}
		
		int start=arr[0];
		int end=arr[m-1];
		int mindiff=end-start;
		
	for(int k=0;k<arr.length-m+1;k++){
		int diff=arr[k+m-1]-arr[k];
		if(mindiff>diff){
			mindiff=diff;
			}
	}
		
		
	System.out.println("Output is : "+ mindiff);
		
		
	}
}
