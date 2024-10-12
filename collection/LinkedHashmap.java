package com.collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Map<String, Integer> lhm = new LinkedHashMap<>();
        
        lhm.put("vishal", 10);
        lhm.put("sachin", 30);
        lhm.put("vaibhav", 20);
        lhm.put("Rahul", 34);
        lhm.put("deepak", 77);
        
        System.out.println(lhm);//key accordding maintainning order
        
        Set entryset=lhm.entrySet();
        
        Iterator it= entryset.iterator();
        
        System.out.println("Iterate throug entry set..");
        
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
        
        
        System.out.println("Get by key:-"+lhm.get("Rahul"));
        
        System.out.println("Size of map:-"+lhm.size());
        
        System.out.println("After remove");
        
        System.out.println(lhm.remove("deepak"));
        
        
        System.out.println("After remove size:-"+lhm.size());
        
        // iterate map

        for(Entry<String,Integer> hm: lhm.entrySet()) {
        	
        	System.out.println(hm.getKey()+" "+hm.getValue());
        	
        }
        
        Map<Integer, String> lhm2 = new LinkedHashMap<>();
        
        lhm2.put(1, "rahul");
        lhm2.put(2, "keyur");
        lhm2.put(4, "ravi");
        lhm2.put(6, "raju");
        lhm2.put(3, "sanju");
        
        System.out.println("Key According maintain The order");
        System.out.println(lhm2);

        



	}

}
