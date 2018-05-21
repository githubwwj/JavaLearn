package com.wwj.java.thread;

public class ThreadTest {

	public static void main(String[] args) {

		MyThread myThread1 = new MyThread("thread 11111111");
		MyThread myThread2 = new MyThread("thread 22222222");
		MyThread myThread3 = new MyThread("thread 22222222");
		MyThread myThread4 = new MyThread("thread 22222222");

		myThread1.start();
		myThread2.start();
		myThread3.start();
		myThread4.start();
//		go();
	}
	
	
	public static void go(){
		if(true){
			for(;;){
				break;
			}
		}
		
		System.out.println("====over==111===");
	}

}





class MyThread extends Thread {

	String name;

	public static int mTicketNum = 100;

	public MyThread(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {

		while (true) {
			synchronized (MyThread.class) {
				if(mTicketNum>0){
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("=====mTicketNum=" + mTicketNum+ "=====name=" + Thread.currentThread().getName());
					mTicketNum--;
				}else{
					break;
				}
			}
		}

	}

}
