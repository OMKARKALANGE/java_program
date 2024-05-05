//Write a Java program to create a class called Vehicle with a method 
//called drive(). Create a subclass called Car that overrides the drive() method to print
//"Repairing a car".
package javademo;

public class Vehicle {
	
	public void drive()
	{
		System.out.println("Drive method in vehical class");
	}
	public void main (String args[])
	{
		
		Vehicle vc= new Vehicle();
		vc.drive();
	}

}
