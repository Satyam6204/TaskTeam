package com.nt.sbeans;

import java.util.ArrayList;

public class Company {
	
	private ArrayList<Department> dept;


	public void setDept(ArrayList<Department> dept) {
		this.dept = dept;
	}
	
	public String ShowDepartment() {
	
		System.out.println("List of Department ::::::::::>");
		
		for(Department deptList : dept) {
			System.out.println(deptList);
		}
		
		
		return "All Departmant List";
	}
	
	
	
	
	
	
	
	
	
	

}
