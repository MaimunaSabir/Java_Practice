
class Employee{
	String name;
	int salary;
	int bonus;

Employee(String n,int s,int b){
	name=n;
	salary=s;
	bonus=b;
}

void calculateSalary(){
	int bon=salary*bonus/100;
	salary=salary+bon;
System.out.println("Ur salary after bonus is : "+salary);
}




}



public class Main {
	public static void main(String[] args) {
		Employee e=new Employee("Maimuna",2000,10);
		e.calculateSalary();
	}
}