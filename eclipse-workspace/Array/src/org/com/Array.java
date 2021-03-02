package org.com;

public class Array {

	public static void main(String[] args) {

		int a[] = new int[5];

		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;

		// to get a particular index of the array
		System.out.println(a[4]);

		// to get the length of the array
		System.out.println(a.length);

		// to get all the values inside the index
		for (int i = 0; i < a.length; i++) {

			System.out.println("a[i]  = " +  i);

		}
	}

}
