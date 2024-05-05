//Write a Java program to create a class called "Rectangle" with width and height attributes.
//Calculate the area and perimeter of the rectangle.


package javademo;

import java.util.Scanner;

public class Rectangle {
	
	public void area(int height, int width)
	{
		int area= height * width;
		System.out.println("Area of rectangle is = "+ area);
		
	}
	public void perimeter(int height, int width)
	{
		int peri= 2*(height+ width);
		System.out.println("perimeter of rectangle is = "+ peri);
		
	}
	
	public static void main(String args[])
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter height =");
		int a= sc.nextInt();	
		
		System.out.println("enter width =");
		int b= sc.nextInt();	
		
		Rectangle r= new Rectangle();
		r.area(a,b);
		r.perimeter(a,b);

		
		
		

	}

}
