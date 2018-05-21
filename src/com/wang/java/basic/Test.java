package com.wang.java.basic;

import java.util.Random;

/**
 * @author Administrator
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//10以内的随机数  
        Random random = new Random();  
        for (int i = 0; i < 10; i++) {  
            int i1 = random.nextInt(10)+1;  
            System.out.println(i1);  
        }  

	}

}
