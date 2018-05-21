package com.wang.java.basic;

public class LeftMove {

	public static void main(String[] args) {

		leftMove();
		rightMove();

		System.out.println(Integer.toBinaryString(3));
		

	}

	

	/**
	 * 2 <<3 一个数左移3位相当于一个数乘以2的3次方
	 */
	private static void leftMove() {
		int result = 2 << 3; // 2 * 2的3次方=2*8=16
		System.out.println("=======左移=" + result);
	}

	/**
	 * 16 >> 3 一个数右移3位相当于一个数除以2的3次方
	 */
	private static void rightMove() {
		int result = 16 >> 3; // 16 / 2的3次方=16*8=2
		System.out.println("=======右移=" + result);
	}

}
