package com.nt.sbeans;

public class Department {

	private int Id;
	
	private String DeptName;

	public void setId(int id) {
		this.Id = id;
	}

	public void setDeptName(String deptName) {
		this.DeptName = deptName;
	}

	@Override
	public String toString() {
		return "Department [Id=" + Id + ", DeptName=" + DeptName + "]";
	}
	
	
	
	
	
	
	
	
	
}
