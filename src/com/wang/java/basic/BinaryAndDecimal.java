package com.wang.java.basic;

public class BinaryAndDecimal {

	public static void main(String[] args) {
		String result = toBinary(6);
		toDecimal(result);
		
//		StringBuffer str=new StringBuffer();
//		str.append("abcde");
//		System.out.println(str);
//		System.out.println(str.reverse());
	}

	private static String toBinary(int i) {
		StringBuffer stringBuffer = new StringBuffer();
		while (i > 0) {
			stringBuffer.append(i % 2);
			i /= 2;
		}
		String binStr = stringBuffer.reverse().toString();
		System.out.println(binStr);
		return binStr;
	}

	private static int toDecimal(String str) {
		int pow = 0;
		int result = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			result += Integer.parseInt(str.charAt(i) + "") * Math.pow(2, pow);
			pow++;
		}
		System.out.println(result);
		return result;
	}

}
