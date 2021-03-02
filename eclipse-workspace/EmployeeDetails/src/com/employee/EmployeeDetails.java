
package com.employee;

public class EmployeeDetails  {

	public void emp(String name) {

		System.out.println("The employee name:" + name);
	}

	public void emp(int id) {
		System.out.println("The employee Id: " + id);
	}

	public static void main(String[] args) {

		EmployeeDetails ed = new EmployeeDetails();

		ed.emp("Sindhu");
		ed.emp(336607);
		ed.homeloan();
//		ed.homeLoan();
//		ed.carLoan();
//		ed.educationLoan();
	}

}
