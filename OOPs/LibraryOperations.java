class Library{
	String name;
	int isbn;
	String author;
	boolean isIssue=false;
	
Library(String n,int isb,String aut){
	name=n;
	isbn=isb;
	author=aut;
}


void issueBook(){
	if(isIssue){
	System.out.println("Not available");
	}
	else{
	System.out.println("Issue Successfully");		isIssue=true;
	}
		
}

void returnBook(){
	if(isIssue){
	System.out.println(" Returned");
	isIssue=false;
	}
	else{
	System.out.println("Book was not issued");
	
	}
	


}

}


public class Main {
	public static void main(String[] args) {
		Library l1=new Library("Oops",13455,"Mirza");
		l1.issueBook();
		l1.returnBook();
	}
}