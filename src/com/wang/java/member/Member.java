package com.wang.java.member;

public class Member {

//	5.  静态代码块在类加载期间执行，而且只执行一次，且执行顺序为静态代码块 构造代码块  构造函数
//	6.  类中的成员包括成员变量，成员函数，构造函数，构造代码块，静态成员，静态代码块
	
	//类中的成员====>成员变量
	private int age;
	
	//类中的成员====>静态成员
	public static String name="wwj";
	
	public static void sayHello(){
		System.out.println("=========Hello Word=========="+name+"你好");
		
	}
	
	//类中的成员====>成员函数
	public int add(int a,int b){
//		非静态方法可以访问静态方法
		sayHello();
		return a+b;
	}
	
	public static void main(String[] args) {

		Member member=new Member();
		
		int result=member.add(5, 20);
		System.out.println(result);
		
//		静态成员通过类访问
		Member.sayHello();
		
		
		
	}
	
	
	
	/**
	 * 类中的成员====>静态代码块
	 */
	static{
		System.out.println("==========静态代码块====");
	}
	
	
	/**
	 * 类中的成员====>构造代码块
	 */
	{
		System.out.println("=======构造代码块====");
	}
	
	/**
	 * 类中的成员====>构造函数
	 */
	public Member(){
		System.out.println("============构造函数=====");
	}
	
}
