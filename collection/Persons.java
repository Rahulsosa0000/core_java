package com.collection;

public class Persons {

	int personid;
	String name;

	public Persons(int personid, String name) {
		super();
		this.personid = personid;
		this.name = name;
	}

	public int getPersonid() {
		return personid;
	}

	public void setPersonid(int personid) {
		this.personid = personid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Persons [personid=" + personid + ", name=" + name + "]";
	}

}
