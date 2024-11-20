package com.Generics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/*A generic for loop in Java allows you to iterate over a collection (like a list or an array) 
 * that contains elements of a specific type, ensuring type safety.
 * 
 */
public class GenericForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> fruits = Arrays.asList("Apple","Cherry","Banana","Watermelon","Grapes");
		
		for( String element :fruits) {
			
			System.out.println(element);
		}
		System.out.println("______________________________");
		
		List<Integer> number= Arrays.asList(1,3,5,7,9,11);
		
		for(int element: number) {
			
			System.out.println(element);
		}
		System.out.println("______________________________");

		Set<String> names = new HashSet<>();
        names.add("Aliya");
        names.add("Bobby");
        names.add("Chahat");

        // Generic for loop to iterate over the set
        for (String name : names) {
            System.out.println(name);  // Print each name in the set
        }
        System.out.println("________________________");
        Map<Integer,String> hm= new HashMap<>();
        
        hm.put(1, "Rahul");
        hm.put(2, "Dilip");
        hm.put(3, "Bunty");
        hm.put(4, "Ramesh");
        
//        
    		   
        
        for(Map.Entry<Integer,String> entry: hm.entrySet()) {
        	entry.getKey();
        	entry.getValue();
        	
        	System.out.println(entry);
        }
        
        // for each lambda expression 
//        hm.forEach((id,name)->
//        {
//        	System.out.println(id+"="+name);
//        });
        	
    //    HashMap<Integer,String> sort=hm.entrySet()
//				.stream()
//				.sorted((v1,v2)->v1.getValue().compareTo(v2.getValue()))
//				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(ov,nv)-> ov, LinkedHashMap::new));
//     // store in linkedhasmap because hashmap does not main tain order so give any output
//        
//        System.out.println("Sorted:-"+sort);

	}

}
