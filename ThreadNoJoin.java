package com.threaddemo;

public class ThreadNoJoin extends Thread
{

	public void run()
	{
		System.out.println(Thread.currentThread() .getName() + "1");
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread() .getName() + "2.5");
	}
	public static void main(String[] args) {
		
		ThreadNoJoin tj= new ThreadNoJoin();
		ThreadNoJoin tj2= new ThreadNoJoin();
		tj.setName("Tara");
		tj2.setName("Yashna");
		tj.start();
		tj2.start();
		try {
			tj.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//tj2.join();
	}
}
