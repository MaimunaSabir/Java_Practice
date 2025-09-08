import java.util.HashSet;
import java.util.Iterator;
public class Main {
	public static void main(String[] args) {

int arr[]={1,2,3,4,4};				
HashSet<Integer> set=new HashSet<>();
		
	/*	set.add(1);
		set.add(2);
		set.add(4);
		set.add(1);
		set.add(3);
		set.add(7);
		set.remove(1);
		
		
		System.out.println(set);
		
		if(set.contains(3))
		System.out.println("Present");
		else
		System.out.println("Not present");
		
		System.out.println(set.size());
		
		Iterator it=set.iterator();
		
	while(it.hasNext()){
		System.out.println(it.next());
		*/	
		
for(int i=0;i<arr.length;i++){
		if(!set.contains(arr[i])){
				set.add(arr[i]);	
		}
		else{
			System.out.println("Dublicate number = "+arr[i] );
		}
		}
	}
}