package javademo;
import java.util.*;

public class Reverse {
	public static void main (String args[])
	{
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		
	
		int num;
		while(a!=0)
		{
		num=a%10;
		System.out.print(num);
		a = a/10;
			
			
		}
	}
	

}
