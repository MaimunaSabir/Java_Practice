public class Main {
		public static String reverse(String str,String rev,int length){
	
	if(length<0){
//System.out.print(rev);
		return rev;
	}
	
	rev=rev+str.charAt(length);
return  reverse(str,rev,length-1);
	
		}
	
	
	public static void main(String[] args) {
		String name="Madam";
			String rev="";

String re=	Main.reverse(name,rev,name.length()-1);
			if(name.equalsIgnoreCase(re)){
				System.out.print("  yes ,plindrome");
			}else
				System.out.print("  Not,plindrome");	
		
			 	}
}