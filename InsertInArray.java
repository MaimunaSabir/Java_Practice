public class Main {
	public static void main(String[] args) {
		int arr[]={105,106,107,108,109};
		int roll=005;
		int idx=3;
		
			int newArr[]=new int [arr.length+1];	
			for(int i=0;i<arr.length;i++){
				newArr[i]=arr[i];
			}
for(int i=newArr.length-1;i>=idx;i--){
			newArr[i]=newArr[i-1];
		}
		
	
		
newArr[idx]=roll;
	for(int i=0;i<newArr.length;i++){
			System.out.println(newArr[i]);
	}		
		
		
	}
}