package com.p2;

public class AppUtility {
	private static  double num= 6; 
	/* If you are using the variable inside static method, make it as static*/
	public static String replaceCommaWithHiphen(String str) {
		System.out.println(num);
		return str.replace(",", "-");
	}
}
//interest amount = p*n*r / 100 