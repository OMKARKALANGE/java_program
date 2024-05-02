package in.ashokit;
import java.util.Scanner;


public class DemoPractise {
	


		public static void main(String[] args) {
		//*********************program of cofee get coffe free on 6 coffee	***********************
		//	Scanner sc =new Scanner(System.in);
		//	System.out.println("Enter numberr");
			//int obj=sc.nextInt();
		//	System.out.println(obj+obj/6);
			
			
	//*************************extract digits from number******************************
			
//		Scanner sc=new Scanner(System.in);
//			System.out.println("Enter a number to Extract digits");
//			int n= sc.nextInt();
//			while(n!=0)
//			{
//				int digits=n%10;
//				System.out.println(digits);
//				n=n/10;
//				
//			}

			
			
			
	//**************************** sum of digits in given number *************************
//			Scanner ob= new Scanner(System.in);
//			System.out.println("Enter a number makda");
//			int numberFromUser =ob.nextInt();
//			int d;
//			int sum=0;
//			
//			while(numberFromUser >= 0)
//			{
//				d =numberFromUser%10;//123
//				//int sum=0;
//				sum = sum+d;
//			   numberFromUser= numberFromUser/10;//12//
//			
//				
//			}
//			
//			System.out.print("sum of digits "+sum);
//			
//			
//			
	//*************************sum of even digits present in the givenn number****************************
			
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter a number");
//			int number =sc.nextInt();
//			
//			int d,sum;
//			sum=0;
//			while(number>0)
//			{
//				d=number%10;
//				if(d%2==0)
//				{
//				sum=sum+d;
//				}
//				number=number/10;
//				
//				
//			}
//		System.out.println("sum of even digits is" +"="+sum);
	//	
	//	
//		output==
//				Enter a number
//				12345678
//				sum of even digits is20
			
	//****************************print sum of prime digits present in given numbers*****************************
			
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Number Enter kara");
//			int number=sc.nextInt();
			
//			int d,sum;
//			sum=0;
//			while(number!=0)
//			{
//				d=number%10;
//				if(d==2 || d==3 || d==5 || d==7)
//				{
//					sum=sum+d;
//					
//				}
//				number =number/10;
//							
//				
//			}
//			System.out.println(sum);
	//
	//***OUTPUT == Number Enter kara
//			123456789
//			17		
			
	//****************************sum of digits which are divisible by 3 *******************************
			
//			Scanner sc =new Scanner(System.in);
//			System.out.println("number enter kara");
//			int number =sc.nextInt();
//			int d,s;
//			s=0;
//			while(number!=0)
//			{
//				d=number%10;
//				if(d%3==0)
//				  s=s+d;
//				number=number/10;
//				
//			}
//			
	//	
//			System.out.println(s);
	//*******OUTPUT=number enter kara
//			123456
//			9
		
//******************Calculate digits in given Number***************

//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter a number");
//		 System.out.println(sc.nextLine().length());
		 
		 
//*****************simple logic******
		 
	/*	 int x=sc.nextInt();
		 int c =0;
		 while(x!=0)
		 {
			 
			int w =x/10;
			c++;
			 
		 }	
		 System.out.println(c);
			 
		*/
	
//******************reverse  digit **************************
	
//	Scanner sc = new Scanner(System.in);
//	System.out.println("enter a number");
//	int number = sc.nextInt();
//	int rev=0;
//	int digit;
//	while(number!=0)
//	{
//		digit = number%10;
//		rev =rev*10+digit;
//		number= number/10;
//		
//	}
//	System.out.println(rev);
	
//	String s= sc.nextLine();
//	StringBuffer sb= new StringBuffer(s);//stringbuffer has these reverse function string does not have rev function
	
//	System.out.println(sb.reverse());
	
	
//********************Duck number or not if zero is present in given number then it is duck number	
	
			
/*			Scanner sc = new Scanner(System.in);
			System.out.println("enter a number");
			String s = sc.nextLine();
			System.out.println((s.contains("0"))?"yes":"no");
			 
*/			 
			 //LBP 11
//**************************To check if given digit is present in number or not*******
			
/*			Scanner sc=new Scanner(System.in);
			System.out.println("eNter a number ");
			int number =sc.nextInt();
			
			System.out.println("Enter a digit to check");
			int digit =sc.nextInt();
			
	/*		while(number!=0)
			{
				int c =number%10;
	
				if(  c ==digit)
				{
				   
					System.out.println(digit +"is present in given number");     
				}
				
				number=number/10;
			}
		*/
/*	int c =0;
	while(number!=0)
	{
		if(number%10==digit)
			c++;
		number=number/10;
	}
	System.out.println(digit +"  is present in given number "  +c   +" times");
*/
//************************Palindrome******************	
/*		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		
		int temp =number;
		int d,rev=0;
		while(number!=0)
		{
			d =number%10;
			rev=rev*10+d;
			number=number/10;
		}
		if(rev==temp)
			System.out.println("given number is palindrome");
		else
			System.out.println("not palindrome");
		
		
	*/
	/*		
	Scanner sc =new Scanner(System.in);
	System.out.println("enter a number");
	String s =sc.nextLine();
	StringBuffer sb =new StringBuffer(s);
	sb.reverse();
	String s1=new String(sb);
	System.out.println((s.equals(s1))?"Yes" :"no");
			
		*/ 
			
/*
 * Check Birth Day

Lisa always forgets her birthday which is on th 5th July.

So develop a function/method which will be helpful to
remember her birthday.


The function/method checkBirthday return an integer 1, 
if it is her birthday else return 0.the function/method 
checkBirthday accepts two arguments.Month, a string 
representing the month of her birth andday, an integer 
representing the data of her birthday.


input

- -> month & day

constraints -----> no

output

- -> 1 or 0			
 */
	/*		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter date");
			int a=sc.nextInt();
			System.out.println("Enter month correctly");
			
			String s =sc.nextLine();
			
			if(s.equals("july")&& a==5 )
			{
				System.out.println(1);
			}
			else
				System.out.println(0);
			*/
			
			//LBP12

			
			

			int n=4;
			int m=5;
			
			for(int i=1;i<=n;i++)
			{
				for(int j=i;j<=m;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
				
		
			
			
		}


	}



