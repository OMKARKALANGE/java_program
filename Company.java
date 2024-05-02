package com.anudipdemo;

 interface Employee
{
	abstract void show();
	void project();
	static void salary()
	{
		System.out.println("EMPLOYEE SALARY");
	}
	 
	
}
class PermanentEmp implements Employee
{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
	public void project()
	{
		
	}
	
	
	
}
public class Company {
	public static void main(String[] args) {
	//	Employee emp1=new Employee();
	//	emp1.show();
	//	permanentEmp emp2=new permanentEmp();
	
	
	}

}
