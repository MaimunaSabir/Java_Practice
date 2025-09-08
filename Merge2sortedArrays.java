public class Main {
	public static void main(String[] args) {
		
		int [] arr1={1,3,5,7};
		int [] arr2={2,4,6,8};
	
int merge[]=new int [arr1.length+arr2.length];

int i=0;
int j=0;
int x=0;


while(i<=arr1.length-1&& j<=arr2.length-1)
{
	if(arr1[i]<arr2[j]){
				merge[x++]=arr1[i++];
	}
	else{
				merge[x++]=arr2[j++];
				
					}	
					}
	while(i<=arr1.length-1){
		merge[x++]=arr1[i++];
		}			
			while(j<=arr2.length-1){
		merge[x++]=arr2[j++];
		}	
		
	for(int k=0;k<merge.length;k++){
			System.out.println(merge[k]);											}
		
	}
}