package com.wwj.java.thread;

class Resouce{
	String name;
	String sex;
}

class Input implements Runnable{

	private Resouce r;

	Input(Resouce r){
		this.r=r;
	}
	
	public void run() {
		int x=0;
		while(true){
			synchronized (r) {
				if(x==0){
					r.name="wwj";
					r.sex="man";
				}else{
					r.name="hh";
					r.sex="woman";
				}
				x=(x+1)%2;
			}
			
		}
	}
	
}

class Output implements Runnable{

	private Resouce r;

	Output(Resouce r){
		this.r=r;
	}
	
	public void run() {
		while(true){
			synchronized (r) {
				System.out.println(r.name+"===="+r.sex);
			}
		}
	}
	
}

public class ResorceDemo {

	public static void main(String[] args) {
		Resouce res=new Resouce();
		Input input=new Input(res);
		Output output=new Output(res);
		
		Thread t1=new Thread(input);
		Thread t2=new Thread(output);
		
		t1.start();
		t2.start();
	}

}
