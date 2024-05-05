package com.ExceptionDemo;

public class ThrowsDemo {
	void validate(int age)
	{
		if(age<18)
			throw new ArithmeticException("age is not valid");
		else
			System.out.println("eligible");
		
	}

	public static void main(String[] args) {
		ThrowsDemo td=new ThrowsDemo();
		try {
			td.validate(13);
		}catch(ArithmeticException ae)
		{
			System.out.println("age is less ");
		}
		System.out.println("main bhi execute ho raha hoon");
	}
}
