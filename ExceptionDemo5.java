package com.ExceptionDemo;

public class ExceptionDemo5 {
   public static void main(String[] args) {
	int result, a=0,b=0;
	try
	{
		result =a/b;
		System.out.println(result);
		
	}catch(ArithmeticException ae)
	{
		System.out.println("division by 0 is not possible");
	}catch (NullPointerException e) {
		System.out.println("no values in vAriable");
	}
	catch (ArrayIndexOutOfBoundsException aie) {
		System.out.println("");
	}
	finally
	{
		System.out.println("close all the connections");
	}
	System.out.println("bacha hua code execute hoga");
}

}
