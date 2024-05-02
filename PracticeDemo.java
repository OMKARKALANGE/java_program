package com.anudipdemo;

import java.util.Scanner;

//Sizes of Datatypes
//byte =1
//short=2
//int=4
//long=8

//float=4
//double=8

//char=2
//boolean=1

//explicit casting we have to explicitly add the datatype to convert it.
public class PracticeDemo {
/*	int a;
	PracticeDemo()
	{
		a=3;
		System.out.println(a);
	}
	PracticeDemo(int a)
	{
		a=3;
		System.out.println(a);
	}
	
	//short result =(short) (a+b);*/
	int result ;
	
	int add(int a,int b)
	{
		result =a+b;
		//System.out.println("addition of 2 numbers"+ result);
		return result;
	}
	public static void main(String[] args) {
		
		PracticeDemo p2=new PracticeDemo();
		
		//PracticeDemo p=new PracticeDemo(3);
		//PracticeDemo p1=new PracticeDemo();

		//Scanner sc= new Scanner(System.in);
		
		//int a=sc.nextInt();
		//int b=sc.nextInt();
		//System.out.println(p2.add(3,4));
		
	//	p.add(a,b);
		int n= p2.add(3,4);
		System.out.println(n);
	}

}
