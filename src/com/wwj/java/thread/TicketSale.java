package com.wwj.java.thread;

class Bank{
	private int sum;
	/**
	 * 同步函数
	 * @param num
	 */
	public synchronized void add(int num){
		sum+=num;
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("===sum="+sum);
	}
}


class Person implements Runnable{
	
	Bank mBank=new Bank();
	
	public void run(){
		for(int i=0;i<3;i++){
			mBank.add(100);
		}
	}
	
}

public class TicketSale {

	public static void main(String[] args) {
		Person person=new Person();
		Thread thread1=new Thread(person);
		Thread thread2=new Thread(person);
		
		thread1.start();
		thread2.start();
	}

}


