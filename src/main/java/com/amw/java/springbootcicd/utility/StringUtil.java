package com.amw.java.springbootcicd.utility;

public class StringUtil {
	public static boolean isNull(String str) {
		return str.isEmpty() || "".equals(str) || str == null;
	}
	
	public static void main(String[] args) {
		System.out.println("String Util starting");
		
		isNull("ayeminwai");
		
		isNull(" ");
		
		isNull(null);
	}
}
