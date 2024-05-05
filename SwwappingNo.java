package javademo;
import java.util.*;

public class SwwappingNo {
	public void swap(int a,int b)
	{
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println("value of a" + a);
		System.out.println("vslue of b"+ b);

		

		
	}
	
	
	
	public static void main(String atgs [])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number to swap  a =");
		int a= sc.nextInt();
		System.out.println("enter first number to swap  b =10");
		int b= sc.nextInt();
		
		 SwwappingNo sw=new  SwwappingNo();
		 sw.swap(a,b);
		 
	}

}
