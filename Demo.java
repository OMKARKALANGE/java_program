package javademo;

public class Demo {
	
	public void sum(int a,int b)
	
	{
		int c=b+a;
		System.out.println(c);
		
		
	}
	public static void main (String aargs[]) {
		
		Demo d= new Demo();
		d.sum(4,5);
		int x=50;
		int y=10;
		System.out.println("x+y  = " + (x+y));
		System.out.println("x-y  = " + (x-y));
		System.out.println("x*y  = " + (x*y));
		System.out.println("x/y  = " + (x/y));
		System.out.println("x%y  = " + (x%y));
		System.out.println( x++);
		System.out.println(++x);
		System.out.println(--x);
		 
	}

}
