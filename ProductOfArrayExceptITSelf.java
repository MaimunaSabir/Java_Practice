public class Main {
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6};
	int ris[]=new int [arr.length];
			
			
		for(int i=0;i<arr.length;i++){		
	int multiple=1;
		for(int j=0;j<arr.length;j++){		
			multiple*=arr[j];
		}
	multiple=multiple/arr[i];
		  ris[i]=multiple;		
	}
		
	
		for(int i=0;i<ris.length;i++){
			System.out.println( ris[i]);
}		}
	
}