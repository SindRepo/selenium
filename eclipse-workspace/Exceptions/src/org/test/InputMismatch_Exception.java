package org.test;

import java.util.Scanner;

public class InputMismatch_Exception {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter a number");
		
		int nextint = scanner.nextInt();
		
		System.out.println("The number you have ebtered is:" + nextint);
	}

}
