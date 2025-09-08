public class Main {
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6};
	int 	k=2;
	
	for(int j=0;j<k;j++){
			int tem=arr[0];
	
		for(int i=0;i<arr.length-1;i++){
		
	arr[i]=arr[i+1];
	
		
	}
	arr[arr.length-1]=tem;
		
}
for(int i=0;i<arr.length;i++)
System.out.println(arr[i]);
	}
}