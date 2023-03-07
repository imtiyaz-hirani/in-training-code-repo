package com.p2;

public class StringOps {
	
	/* add welcome to the given string and replace all , with hiphen */
	public String editString(String str) {
		return "Welcome " + AppUtility.replaceCommaWithHiphen(str);
	}
}
