package com.wang.java.basic;

public class Method {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		tell(10);
		
		tell("hello");
		
		tell(3,5);
		
	}
	
	public static void tell(){
		System.out.println("========");
	}

	public static void tell(int a){
		System.out.println("========a="+a);
	}
	
	public static void tell(String str){
		System.out.println("========str="+str);
	}
	
	public static void tell(int a,int b){
		System.out.println("========a+b="+(a+b));
	}
	
	
	
	
	
}
