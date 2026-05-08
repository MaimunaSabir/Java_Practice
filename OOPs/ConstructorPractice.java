class Student{
	String name;
	int age;
	int marks;
	
Student(){
	System.out.println("Constructor is created");
}

Student(String n,int a,int m){
	name=n;
	age=a;
	marks=m;
	System.out.println("Perameterized Constructor is created");
}

void display(){
	System.out.println(name);
	System.out.println(age);
	System.out.println(marks);
}



}


public class Main {
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student("Maimuna",12,45);
		s2.display();
	}
}