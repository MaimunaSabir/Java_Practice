import java.util.*;
public class Main {
	
public	static void search(int arr[],int k){
		
PriorityQueue <Integer> pq=new PriorityQueue <>();

		for(int i=0;i<arr.length;i++){
			pq.add(arr[i]);
			}
					
		
	
	while(pq.size()> k){
			pq.poll();
	}
System.out.println("kth highest element is : "+ pq.peek());
		
	}
	
	
	public static void main(String[] args) {
		
		int arr[]={4,3,6,2,3,1};
		int k=2;
		Main.search(arr,k);
		
		
	}
}