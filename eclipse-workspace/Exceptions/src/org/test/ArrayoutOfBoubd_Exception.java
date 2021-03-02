package org.test;

public class ArrayoutOfBoubd_Exception {
	
	public static void main(String[] args) {
		
		int a[]	= new int[10];
		
		a[0] = 10;
		a[1] = 11;
		a[2] = 102;
		a[3] = 103;
		a[4] = 150;
		a[5] = 170;
		
		int length = a.length;
		
		System.out.println(length);
		
		System.out.println(a[11]);
		
		
				
	}

}
