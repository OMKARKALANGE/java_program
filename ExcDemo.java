package com.ExceptionDemo;

public class ExcDemo {
	public static void main(String[] args) {
		int a=30,b=0;
		try {
			int c=a/b;
			System.out.println("result="+c);
		}catch(ArithmeticException ae){
			System.out.println("b ka value 0 hain");
		}
	}

}
