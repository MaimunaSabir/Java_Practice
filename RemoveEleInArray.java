public class RemoveEleInArray {
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		int idx=2;
	//	int newArr[arr.length-2];
		
		for(int i=idx+1;i<arr.length;i++){
			arr[i-1]=arr[i];
		
		}
		
		for(int i=0;i<arr.length-1;i++){
			System.out.println(arr[i]);
	}
	}	
}