package com.threaddemo;
class SleepDemo extends Thread
{
	@Override
	public void run()
	{
		for(int i=1; i <= 5 ; i++)
		{
			System.out.println(i);
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//sleep(i, i);
		}
	}
}
public class ThreadSleepDemo {

	public static void main(String[] args) {
		SleepDemo sl=new SleepDemo();
		sl.start();

	}

}
