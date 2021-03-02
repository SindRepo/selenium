package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {
	
	public void empName()

	{
		System.out.println("The employeee name is Pragya");
	}
	
	public static void main(String[] args) {
		
		Employee en = new Employee();
		Company cn = new Company();
		Client cna = new Client();
		Project pn = new Project();
		
		en.empName();
		cn.companyName();
		cna.clientName();
		pn.projectName();
	}
}

