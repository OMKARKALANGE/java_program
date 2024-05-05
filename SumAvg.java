//Write a program in Java to input 5 numbers from the keyboard and find their sum and average.

package javademo;
import java.util.*;


public class SumAvg {
	public static void main (String args[])
	{

	Scanner sc = new Scanner(System.in);

	System.out.println("ENTER FIRST NUMBER");
	
	int i =sc.nextInt();
	
	System.out.println("ENTER SECOND NUMBER");

	int j =sc.nextInt();
	
	System.out.println("ENTER THIRD NUMBER");

	int k =sc.nextInt();
	
	System.out.println("ENTER FOURTH NUMBER");

	int l =sc.nextInt();
	
	System.out.println("ENTER FIFTH NUMBER");

	int m =sc.nextInt();
	
	int sum =(i+j+k+l+m);
	System.out.println("SUM = " + sum);
	
	int avg = (sum / 5);
	System.out.println("AVERAGE = " +avg);

	
	

	

	
	

	}
}
