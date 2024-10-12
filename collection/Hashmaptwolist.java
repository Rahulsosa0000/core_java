package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class Hashmaptwolist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Persons> list1=new ArrayList<>();
		list1.add(new Persons(1,"rahul"));
		list1.add(new Persons(2,"Keyur"));
		list1.add(new Persons(3,"Dilip"));
		list1.add(new Persons(4,"Raju"));
		
		List<Employee> list2=new ArrayList<>();
		list2.add(new Employee(1,"Java developer"));
		list2.add(new Employee(2,"Php developer"));
		list2.add(new Employee(3,"Manager"));
		list2.add(new Employee(5,"HR"));
		
		

        Map<Integer, String> matchedData = new HashMap<>();
        
        for(Persons person: list1) {
        	for(Employee employee: list2) {
        		if(person.getPersonid()==employee.getEmpid()) {
        			String combineddata ="Person: "+person.getName() +",Position: "+employee.getposition();
        			matchedData.put(person.getPersonid(), combineddata);

       		}
        	}
        }
        
        
        
        matchedData.forEach((t, u) -> System.out.println( t + " - "+ u + "\n"));
        System.out.println(matchedData.toString());
        	
//        	Scanner sc=new Scanner(System.in);
//        	System.out.println("Enter ID:-");
//        	int id=sc.nextInt();
//        	
//        	if(matchedData.containsKey(id)) {
//                System.out.println("Matched data for ID " + id + ": " + matchedData.get(id));

//        	}else {
//                System.out.println("No matching data found for ID: " + id);
//
//        	}
        
        System.out.println("____________________________________________");
        
        Map<Persons, Employee> personToEmployeeMap = new HashMap<>();

        // Populate the map by finding matching IDs
        for (Persons person : list1) {
            Optional<Employee> matchedEmployee = list2.stream()
                .filter(employee -> employee.getEmpid() == person.getPersonid())
                .findFirst();

            matchedEmployee.ifPresent(employee -> personToEmployeeMap.put(person, employee));
        }
        
        personToEmployeeMap.forEach((person,employee)-> System.out.println("Person name:-"+person.getName()+" "+
        		                                                       "Position:-"+employee.getposition()));
		

	}

}
