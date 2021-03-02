
package org.emp;

public class Employee {

	public void empId() {
		System.out.println("The employee id is 336607");
	}

	public void empName()

	{
		System.out.println("The employee name is Sindhu");
	}
	
	public void empDob() {
		
		System.out.println("The employee DOB is 14/10/1987");
	}
	
	public void empPhone() {
		
		System.out.println("The employee phone ni. is 8056174009");
		
	}
	
	public void empEmail()
{

		System.out.println("The employee email is abc@gmail.com");
}
	public void empAddress() {
		
		System.out.println("The employee address is No.30, Poes road, teynampet Chennai 18");
	}

public static void main(String[] args) {
	
	Employee es = new Employee();
	
	es.empId();
	es.empName();
	es.empDob();
	es.empAddress();
	es.empEmail();
}
}