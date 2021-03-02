package org.emp;

import java.util.Scanner;

public class EmployeeDetais {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = scanner.nextInt();
		System.out.println("u have entered:" +num);
		
		System.out.println("Enter a name");
		String name = scanner.next();
		System.out.println("u have entered:" +name);
		
		System.out.println("enter a sentence");
		String sen = scanner.nextLine();
		System.out.println("U have entered:" +sen);
	
		
	}

}
