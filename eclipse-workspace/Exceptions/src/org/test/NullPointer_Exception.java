package org.test;

public class NullPointer_Exception {

	public static void main(String[] args) {

		int a = 10;
		
		System.out.println("execution started");

		try {

			System.out.println(a/0);
		}

		catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();

		}
		
		System.out.println("Execution completed");
	}

}
