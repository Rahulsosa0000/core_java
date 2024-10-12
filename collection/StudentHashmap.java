package com.collection;


import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      Map<String, Studenthash> sm = new HashMap<>();
	      
	      sm.put("1", new Studenthash("Rahul", 20, "S101"));
	      sm.put("2", new Studenthash("Keyur", 22, "S102"));
	      sm.put("3", new Studenthash("Dilip", 18, "S103"));
	      sm.put("4", new Studenthash("Sanjay", 21, "S104"));

	      
	      List<Studenthash> filterage = sm.values().stream()
	                .filter(student -> student.getAge() > 20)
	                .sorted((s1, s2) -> Integer.compare(s1.getAge(), s2.getAge())).toList();
//	      
//	      Iterator<Studenthash> ageIterator = filterage.iterator();
//	        while (ageIterator.hasNext()) {
//	            System.out.println(ageIterator.next());
//	        }
	      
	      for (Studenthash student : filterage) {
	    	    System.out.println(student);
	    	}
	      System.out.println("Sorted by name");
	      List<Studenthash> filteredStudents = sm.values().stream()
	                .filter(student -> student.getAge()>10)
	                .sorted((s1, s2) -> s1.getName().compareTo(s2.getName())).toList();// Sort by NAME
	                
	  //    filteredStudents.forEach(t -> System.out.println(t)); //
	      
	      for (Studenthash student : filteredStudents) {
	    	    System.out.println(student);
	    	}
	      
	    

	}

}
