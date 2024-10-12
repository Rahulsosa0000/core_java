package com.collection;

import java.util.HashMap;
import java.util.Map;

class person implements Comparable<person>{
	
	@Override
	public int compareTo(person o) {
		// TODO Auto-generated method stub
		return Integer.valueOf(this.personid).compareTo(Integer.valueOf(o.personid));
	}
	
	int personid;
	String Personename;
	
	
	public person(int personid, String personename) {
		super();
		this.personid = personid;
		Personename = personename;
	}
	public int getPersonid() {
		return personid;
	}
	public void setPersonid(int personid) {
		this.personid = personid;
	}
	public String getPersonename() {
		return Personename;
	}
	public void setPersonename(String personename) {
		Personename = personename;
	}
	@Override
	public String toString() {
		return "person [personid=" + personid + ", Personename=" + Personename + "]\n";
	}
	
}

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, person> hm=new HashMap<>();
		
		hm.put(4, new person(444,"raju"));
		hm.put(2, new person(222,"raju"));
		hm.put(1, new person(111,"raju"));
		hm.put(5, new person(555,"raju"));
		hm.put(3, new person(333,"raju"));
		
		System.out.println(hm);

		
		

	}

}
