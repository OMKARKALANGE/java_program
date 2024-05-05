//Write a Java program to create a class called "Circle" with a radius attribute. You can access 
//and modify this attribute. Calculate the area and circumference of the circle.

package javademo;
import java.util.*;


public class Circle {
	public void area(double r)
	{
		double area= 2.14*r*r;
		System.out.println("Area of circle is = "+ area);
		
	}
	public void circumference(double r)
	{
		double circ= 2*2.14*r;
		System.out.println("perimeter of circle is = "+ circ);
		
	}
		public static void main(String args[])
		
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter radius =");
			double a= sc.nextInt();	
		
			
			Circle c= new Circle();
			c.area(a);
			c.circumference(a);

			
			
			

		

	}


}
