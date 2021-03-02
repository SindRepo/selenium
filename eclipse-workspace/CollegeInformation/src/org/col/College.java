package org.col;

import org.staff.Staff;
import org.stu.Student;

public class College {

	public void collegeName() {

		System.out.println("The college name is SRM");
	}

	public static void main(String[] args) {

		College college = new College();
		
		Student student = new Student();
		
		Staff staff = new Staff();
		
		college.collegeName();
		student.stuId();
		student.stuDept();
		student.stuName();
		staff.stfId();
		staff.stfName();
		staff.stfDept();
		
		
	}
}
