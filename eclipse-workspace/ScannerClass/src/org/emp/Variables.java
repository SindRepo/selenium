package org.emp;

public class Variables {
	
	public static int d = 30; //class variable can be called outside the package//
	
	int b ; // class variable //
	
	public void localVari() {
		
		int a = 12; // local variable //
		System.out.println("The local variable is:" +a);
		System.out.println(b);
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		
		Variables var = new Variables();
		var.localVari();
	}
}
