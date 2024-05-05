package javademo;
import java.util.*;

public class SumOfDigits {
	
	
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		
		int a;
		int sum=0;
		while(num!=0)
		{
			a=num%10;
			if(a%2==0)
			   sum=sum+a;
			num=num/10;
			
		}
		System.out.println(sum);
		
		
	}

}
