//1st class
class Vehicle{
	String colour;
	String brand;

	
Vehicle(String c,String b){
	colour=c;
	brand=b;
	
}

 void displayVehicle(){
 	System.out.println("Color : "+ colour);
 	System.out.println("Brand : "+ brand);

 }
}

//intermediate class 
class Car extends Vehicle{
	String model;

	
Car(String c,String b,String m){
	super(c,b);
	model=m;
	
}

 void displayCar(){
 	displayVehicle();
	System.out.println("Model : "+ model);

 }
}

//3rd child class
class ElectricCar extends Car{
	int battaryCapacity;

	
ElectricCar(String c,String b,String m,int bc){
	super(c,b,m);
	battaryCapacity=bc;
	
}

 void displayEC(){
 	displayCar();
	System.out.println("Battary Capacity : "+ battaryCapacity);

 }
}




public class Main {
	public static void main(String[] args) {
		ElectricCar e=new ElectricCar("Red","Civics","2006",4);
		e.displayEC();
	}
}