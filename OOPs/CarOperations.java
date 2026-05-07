class Car{
	int model;
	String brand;
	String color;
	boolean isRunning;
	
Car(int m,String b,String c,boolean run){
	model=m;
	brand=b;
	color=c;
	isRunning=run;
}
void start(){
 if(isRunning){
 	System.out.println("Car is start");
 }
}

void stop(){
 if(! isRunning){
 	System.out.println("Car is stop ");
 }
}
 void displayData(){
 	System.out.println("Model : "+ model);
 	System.out.println("Colour : "+ color);
	System.out.println("Brand : "+ brand);

 }
}




public class Main {
	public static void main(String[] args) {
		Car c=new Car(2009,"Honda","Red",true);
		c.start();
		c.stop();
		c.displayData();
	
			}
}