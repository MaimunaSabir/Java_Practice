class Person{
	String name;
	int age;
	

Person(String n,int a){
		name=n;
		age=a;
	}
			

void display(){
	System.out.println("Name: "+ name);
	System.out.println("Age: "+ age);
	
}				
					
	}
	
	
class Student extends Person{
		int marks;

	Student(String n,int a,int m){
			super(n,a);
		marks=m;
		}
		
						
void displayData(){
	System.out.println("Marks: "+ marks);
	display();
	
}								
							
}		


public class Main {
	public static void main(String[] args) {
		Student s=new Student("Maimuna",12,45);
		s.displayData();
	}
}