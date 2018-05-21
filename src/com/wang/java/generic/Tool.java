package com.wang.java.generic;

import java.util.List;

/**
 *	泛型定义在类上
 * @param <E>
 */
public class Tool<E> {
	
	E object;

	public E getObject() {
		return object;
	}

	public void setObject(E object) {
		this.object = object;
	}
	
	/**
	 * 泛型定义在方法上
	 * @param q
	 */
	public <Q> void show(Q q){
		System.out.println("=====show="+q);
	}
	
	
	/**
	 * 当泛型静态时,不能访问类上定义的泛型
	 * 如果静态方法使用泛型,只能让泛型定义在方法上
	 * @param q
	 */
	public static <W> void print(W w){
		System.out.println("======static print="+w);
	}
	
	
	public static <W extends Person> void printExtends(W w){
		System.out.println("======name="+w.getName()+"=====age="+w.getAge());
	}

	public static <W extends List<Person>> void printExtends(W w){
		for(int i=0;i<w.size();i++){
			Person person=w.get(i);
			System.out.println("= <W extends List<Person>>=name="+person.getName()+"=====age="+person.getAge());
		}
		
	}

}
