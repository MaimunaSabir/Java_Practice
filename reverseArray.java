public class Main {
	public static void main(String[] args) {
	
			int array []={2,4,1,7,9};
		int end=array.length-1;
for(int i=0;i<array.length/2;i++){
	 
	 int temp=array[i];
	 array[i]=array[end];
	 array[end]=temp;
	 end--;
}
	 	 	 		
for(int i=0;i<array.length;i++){
	 

	 	 	 System.out.println(array[i]);
	 	 	 
}
	}
}