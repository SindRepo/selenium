package org.loop;

import org.omg.CORBA.PRIVATE_MEMBER;

public class MyNumber {

	private int number;

	public MyNumber(int number) {

		this.number = number;
	}

	public boolean isPrime() {

		for (int i = 2; i <= number - 1; i++) {

			if (number % 2 == 0) {

				return false;

			}

		}

		return true;

		// divisible by 1 and itself
		//
	}

	public static void main(String[] args) {

		MyNumber number = new MyNumber(49);

		boolean isPrime = number.isPrime();

		System.out.println("Is prime number  " + isPrime);
	}
}
