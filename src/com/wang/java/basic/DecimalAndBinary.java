package com.wang.java.basic;

public class DecimalAndBinary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String result = decimalToBinary(6);
		System.out.println(result);

		System.out.println(binaryToDecimal(result));

	}

	// 110
	private static int binaryToDecimal(String str) {
		int result = 0;

		int pow = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			result += Integer.parseInt(str.charAt(i) + "") * Math.pow(2, pow);
			pow++;
		}

		return result;
	}

	private static String decimalToBinary(int i) {
		StringBuffer stringBuffef = new StringBuffer();

		while (i > 0) {
			stringBuffef.append(i % 2);
			i /= 2;
		}
		// "abcd"
		// "dcba"
		return stringBuffef.reverse().toString();

	}

}
