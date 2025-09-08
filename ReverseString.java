public class Main {
	
public static void reverse(String str,String rev,int length){

		if(length<0){
	System.out.print(rev);	
			return;}
			
	rev=rev+str.charAt(length);
		
				reverse(str,rev,length-1);	
}
	
	public static void main(String[] args) {
		String str="Noor";
		Main.reverse(str,"",str.length()-1);
		
	}
}