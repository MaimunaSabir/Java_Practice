public class Main {
	public static void main(String[] args) {
				int arr[]={8,5,3,7,1,2};
		
  		// BUBBLE SORT
// 1) swapping 
// 2) Largest element at the end
// 3) compare 2 adjacent ele
     
     for(int i=0;i<arr.length-1;i++){
     	for(int j=0;j<arr.length-1-i;j++){
     		if(arr[j]>arr[j+1]){
     			int temp=arr[j];
     			arr[j]=arr[j+1];
     			arr[j+1]=temp;
     		}
     	}
     }
     		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"  ");
		
		}
	}
}