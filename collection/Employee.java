package com.collection;

public class Employee {

	int empid;
	String position;

	public Employee(int empid, String position) {
		super();
		this.empid = empid;
		this.position = position;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getposition() {
		return position;
	}

	public void setposition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", position=" + position + "]";
	}

}
