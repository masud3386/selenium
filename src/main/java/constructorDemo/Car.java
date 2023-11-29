package constructorDemo;

public class Car {
	String carmodel;
	String color;
	int cost;
	public Car(String cm, String co,int c) {
		carmodel = cm;
		color =   co;
		cost =  c;
				
		
	}
	
	public void cardetails() {
		System.out.println("Model of the car is " + carmodel);
		System.out.println("color of the car is " + color);
		System.out.println("cost of the car is " + cost);
	}
	

}
