package org.com;

public class Strings {
	
	public static void main(String[] args) {
		
		String s = "Welcome to Selenium";
		System.out.println(s);
		
		int length = s.length();
		System.out.println(length);
		
		char charat = s.charAt(4);
		System.out.println(charat);
		
		int indexof = s.indexOf('e');
		System.out.println(indexof);
		
		int lastindexof = s.lastIndexOf('e');
		System.out.println(lastindexof);
		
		boolean contains = s.contains("To");
		System.out.println(contains);
		
		String uppercase = s.toUpperCase();
		System.out.println(uppercase);
		
		String lowercase = s.toLowerCase();
		System.out.println(lowercase);
		
		boolean equals = s.equals("Welcome");
		System.out.println(equals);
		
		boolean equalsignorecase = s.equalsIgnoreCase("to");
		System.out.println(equalsignorecase);
		
		String replace = s.replace("Selenium", "Mainframe");
		System.out.println(replace);
		
		boolean startswith = s.startsWith("Wel");
		System.out.println(startswith);
		
		boolean endswith = s.endsWith("ium");
		System.out.println(endswith);
		
		String substring = s.substring(4);
		System.out.println(substring);
		
}
}