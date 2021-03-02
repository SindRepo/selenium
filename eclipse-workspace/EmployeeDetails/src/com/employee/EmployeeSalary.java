package com.employee;

public class EmployeeSalary  {
	
	public EmployeeSalary(String message) {
		
		System.out.println("the slaray is : " +message);
	}
	
	public EmployeeSalary()
	{
		System.out.println("the variable amount is 25k");		
	}
	

	public void empsal() {

		System.out.println("the employee salaryis 10k");
	}

	public static void main(String[] args) {

		EmployeeSalary es = new EmployeeSalary();
		EmployeeSalary es1 = new EmployeeSalary("30k");
		es.empsal();
	

	}

}