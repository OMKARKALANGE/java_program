package javademo;

public class Vehicle1 {
	
	//Write a Java program to create a class called Vehicle with a method called drive().Create
	//a subclass called Car that overrides the drive() method to print "Repairing a car".
		
			public void drive() {
				System.out.println("Repairing a vehicle");
				
			}
	}
			
	class Car12 extends Vehicle1{
			
			public void drive() {
				System.out.println("Repairing a car");
			}
			
			public static void main(String[] args) {
				// TODO Auto-generated method stub
//				Vehicle1 v=new Vehicle1();
				Car12 cr=new Car12();
				cr.drive();

		}
	}


	
		

	


