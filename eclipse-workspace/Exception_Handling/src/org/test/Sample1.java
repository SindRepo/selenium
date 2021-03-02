package org.test;

public class Sample1 {

	public void method1() {

		try {

			int[] i = {1,2,3};
			
			i[4] = 10;
			
			System.out.println("method 1 ended");

		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("Null Pointer exception");
			
			e.printStackTrace();
		}

		catch (Throwable e) {
			
			e.printStackTrace();
			
			System.out.println("Array index out od bound");
			// TODO: handle exception
		}

	}

	public void method2() {

		method1();

		System.out.println("Method 2 ended");
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {

		Sample1 sample = new Sample1();

		sample.method2();

		System.out.println("Main ended");
	}
}
