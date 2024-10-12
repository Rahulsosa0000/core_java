package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



class Student {

	int rollno;
	String name;
	int age;

	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}

}

class Studentcomparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getAge() - o2.getAge();
	}

}

public class StudentList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> list = new ArrayList<>();
		list.add(new Student(51, "rahul", 23));
		list.add(new Student(54, "Anjali", 20));
		list.add(new Student(53, "Priya", 22));
		list.add(new Student(52, "Aarav", 21));
		list.add(new Student(54, "Anjali", 20));
		list.add(new Student(55, "Rohan", 24));

		Collections.sort(list, new Studentcomparator());
		
		System.out.println("Sorted by Age:-"+list);
		

	}

}

