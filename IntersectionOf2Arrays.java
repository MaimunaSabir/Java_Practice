import java.util.HashSet;
public class Main {
	public static void main(String[] args) {
			int arr[]={1,2,3,4,5,6,7,8,9};
			int way[]={3,4,5,10};
			//O(n+m)
HashSet<Integer> set=new HashSet<>();		
    for(int i=0;i<arr.length;i++){
	     set.add(arr[i]);
	     }
	     
   for(int k=0;k<way.length;k++){
	  if(set.contains(way[k]))   {
	  		System.out.println(way[k]);
	  }
   }
	}
}