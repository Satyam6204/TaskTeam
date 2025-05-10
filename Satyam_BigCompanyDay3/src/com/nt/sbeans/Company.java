package com.nt.sbeans;

import java.util.Map;

public class Company {
	
  
	
	 public Company() {
		System.out.println("Company.Company()");
	}

	private Map<Integer,Department> departments;

	

	public void setDepartments(Map<Integer, Department> departments) {
		this.departments = departments;
	}

	public String showDepartment() {
		System.out.println("Company.showDepartment()");
		
		for(Integer id : departments.keySet() ) {
			
			Department dept= departments.get(id);
			
			System.out.println("DeptID ="+ id +", "+"DeptName"+dept.getDeptName() );
			
		}
		
		return"All List Of Departments";
	}
}