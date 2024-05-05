//Write a Java program and compute the sum of an integer's digits.

package javademo;
import java.util.*;
public class SumOfIntegersDigits {
	
	public void sumOfDigits(int num)
	{
		int sum=0;
		int d;
		while(num!=0)
		{
			d= num%10;
			sum=sum+d;
			num=num/10;
			
			
		}
		System.out.println(sum);
		
	}	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		
		SumOfIntegersDigits sd=new SumOfIntegersDigits();
		sd.sumOfDigits(num);
	}
	
	

}
