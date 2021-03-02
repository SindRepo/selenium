package org.test;

public class NumberFormat_Exception {
	
	public static void main(String[] args) {
		
		String s = "12345";
		
		int s1 = Integer.parseInt(s);
		
		System.out.println(s1);
		
		String valueOf = String.valueOf(s1);
		
		System.out.println(valueOf);
		
		ineger Valueof2 = String.valueOf(valueOf);
		
		System.out.println(Valueof2);
	}

}
