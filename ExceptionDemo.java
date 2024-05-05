package com.ExceptionDemo;

public class ExceptionDemo {
	
	
public static void main(String args[])
{
	System.out.println("Ye statement execute hoga");
	try 
	{
		Integer i= new Integer("abc");
	//Integer i =new Integer("abc");//number format Exception
	}
	catch(NumberFormatException ns)
	{
		System.out.println("String value hai");
	}
	//int a="abc";
	
	System.out.println("Ye statement Execute nahi hoga");
	
}
}
