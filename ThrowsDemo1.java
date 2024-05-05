package com.ExceptionDemo;
import java.io.IOException;


public class ThrowsDemo1 {
	void method1()throws IOException
	{
		throw new IOException("Some Hardware Problem");
		
	}
	void method2()throws IOException
	{
		
		method1();
	}
	void method3()throws IOException
	{
		//try {
		method2();
		//}catch(IOException e)
		//{
		//	System.out.println("In method 3 exception handle hua");
		//}
	}
	public static void main(String[] args) 
	{
		ThrowsDemo1 td=new ThrowsDemo1();
		try
		{
			td.method3();
		}catch(IOException e)
		{
			System.out.println("hsbxjhbJ");
		}
		System.out.println("bacha hua code");
		
	}
	

}
