package com.serialization;

import java.io.Serializable;

public class Employee implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int empid;
	private String name;
	private String city;
	private  int salary;
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Employee(int empid, String name, String city, int salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}



	public int getEmpid() {
		return empid;
	}



	public void setEmpid(int empid) {
		this.empid = empid;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", city=" + city + ", salary=" + salary + "]";
	}
	
	
	
	
	

}
