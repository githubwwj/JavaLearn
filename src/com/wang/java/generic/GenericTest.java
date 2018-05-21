package com.wang.java.generic;

import java.util.ArrayList;


public class GenericTest {

	public static void main(String[] args) {

		Tool<Person> tool=new Tool<>();
		
		Person person=new Person("wwj",(byte) 24);
		tool.setObject(person);
		Person per=tool.getObject();
		
		System.out.println(per.getName()+"======"+per.getAge());
		
		tool.show("abc");
		tool.show(new Integer(3));
		
		Tool.print("hello generic");
		Tool.print(new Float(10));
		
		Tool.printExtends(new Person("ycx",(byte)23));
		
		ArrayList<Person> arrayList=new ArrayList<>();
		arrayList.add(person);
		arrayList.add(new Person("zyh", (byte) 23));
		Tool.printExtends(arrayList);
		
	}

}
