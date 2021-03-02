package com.employee;

public class ICICI extends EmployeeDetails{


	public void homeLoan() {
		
		System.out.println("the home loan is 20%");
		
	}
	
	@Override
	public void emp(int id) {
		// TODO Auto-generated method stub
		super.emp(id);
	}
	
	@Override
	public void emp(String name) {
		// TODO Auto-generated method stub
		super.emp(name);
	}
	
	public static void main(String[] args) {
		
		ICICI icici = new ICICI();
		
		icici.emp(20);
		icici.emp("aruna");
		icici.homeLoan();
	}
}

