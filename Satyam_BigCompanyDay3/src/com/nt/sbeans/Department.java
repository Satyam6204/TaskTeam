package com.nt.sbeans;

public class Department {
	
	
	
	public Department() {
		System.out.println("Department.Department()");
	}
	private String DeptName;
	private int DeptId;
	
	public String getDeptName() {
		return DeptName;
	}
	public void setDeptName(String DeptName) {
		this.DeptName = DeptName;
	}
	public int getDeptId() {
		return DeptId;
	}
	public void setDeptId(int DeptId) {
		this.DeptId = DeptId;
	}
	

}
