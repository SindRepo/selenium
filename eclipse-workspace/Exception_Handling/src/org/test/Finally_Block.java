package org.test;

import java.util.Scanner;

public class Finally_Block {

	public static void main(String[] args) {
		
		Scanner scanner = null;

		try {

			scanner = new Scanner(System.in);

			int[] a = { 4 };

			a[0] = 1;
			a[1] = 23;
			a[2] = 40;
			a[3] = 66;
			a[4] = 88;

		} catch (Exception e) {

			e.printStackTrace();
			// TODO: handle exception
		} finally {
			
			System.out.println("Before scanner close");

			scanner.close();
			
		}

	}

}
