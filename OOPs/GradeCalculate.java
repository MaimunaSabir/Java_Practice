
class Student{
	String name;
	int roll;
	int marks;

Student(String n,int r,int m){
		name=n;
		roll=r;
		marks=m;
		}	
		
				
void calculateGrade(){
	if(marks<40){
		System.out.println("F");
	}
	else if(marks>=80){
			System.out.println("A");
	}
		else if(marks>=70){
			System.out.println("B");
	}
		else{
			System.out.println("C");
	}
				
}




void displayData(){
	System.out.println("Name: "+ name);
	System.out.println("Roll number: "+ roll);
	System.out.println("Marks: "+ marks);
		
}
}


public class Main {
	public static void main(String[] args) {
		Student st=new Student("Maimuna",147,45);
		st.calculateGrade();
		st.displayData();
		
	}
}