package com.employee;

public class RBI  {
	
	public void educationLoan() {
		
		System.out.println("edu loan is 25%");
		
	}
	
	public void laptopLoan() {
		
		System.out.println("laptop loan is 40%");
		
	}

	public static void main(String[] args) {
		
		RBI rbi = new RBI();
		
		rbi.educationLoan();
		rbi.laptopLoan();
	}
}
