package org.test;

public class StringOutOfBound_Exception {
	
	public static void main(String[] args) {
		
		String s ="Exception";
		
		char charAt = s.charAt(10);
		
		System.out.println(charAt);
	}

}
