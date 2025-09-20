import java.util.HashSet;
import java.util.Iterator;
public class Main {
	
public static void findDublicate(int arr[]){

int n=0;
for(int j=0;j<arr.length;j++){
	if(n<arr[j]){
		n=arr[j];
	}
}


HashSet <Integer> set=new HashSet<>();

	for(int i=0;i<arr.length;i++){
	if(!set.contains(arr[i])){
				set.add(arr[i]);
	}
	else{
		System.out.println("A: "+ arr[i]);
	}
	
	}
	int sum=0;
	Iterator it=set.iterator();
	while(it.hasNext()){
		sum+=(int )it.next();
	}
	int s=n*(n+1)/2;
	int diff=s-sum;
	System.out.println("B: "+ diff);		
		
}

	
	public static void main(String[] args) {
	int arr[]={4,3,6,2,3,1};
		Main.findDublicate(arr);
	}
}