package com.ExceptionDemo;

class MeraException extends Exception
{
	private int ex;
	
	public MeraException(int ex)
	{
		super();
		this.ex=ex;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "MeraException [ex="+ ex + "]";
	}
	}
public class UserDefinedException {
	
	
	
	void sum(int a,int b)throws MeraException
	{
		if(a<0)
		{
			throw new MeraException(a);
		}
		else
		{
			System.out.println("the addition is"+(a+b));
		}
		
	}
	
	public static void main(String[] args) {
//throwable		
//exception
//RuntimeException
//IndexOutOfBoundsException
//ArrayIndexOutOfBoundsException
//userdefined exceptions
		UserDefinedException ud =new UserDefinedException();
		try
		{
		ud.sum(-10,10);
		}catch(MeraException me)
		{
			System.out.println("me");
		}
	}
	

}
