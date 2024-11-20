package com.Generics.Set;


import java.util.LinkedHashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class GenericLinkedHashSet<T> {

    public static void main(String[] args) {

        // Create a LinkedHashSet for Integer type
        Set<Integer> intSet = new LinkedHashSet<>();
        intSet.add(10);
        intSet.add(50);
        intSet.add(40);
        intSet.add(30);
        intSet.add(20);
        
        Iterator<Integer> iterator= intSet.iterator();
        
        while(iterator.hasNext()) {
        	System.out.println("Iterat:-"+iterator.next());
        }

        // Display elements in the set
        System.out.println("Integer LinkedHashSet: " + intSet);

        // Filter elements greater than 25 and display them
        Set<Integer> filteredIntSet = intSet.stream()
                .filter(e -> e > 25)
                .collect(Collectors.toSet());
        System.out.println("Filtered (greater than 25): " + filteredIntSet);

        // Sort elements (convert to list for sorting) and display them
        List<Integer> sortedIntList = new ArrayList<>(intSet);
        Collections.sort(sortedIntList);
        System.out.println("Sorted elements: " + sortedIntList);

        System.out.println("______________________________________");

        // Create a LinkedHashSet for String type
        Set<String> stringSet = new LinkedHashSet<>();
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Elderberry");
        stringSet.add("Cherry");
        stringSet.add("Date");

        // Display elements in the set
        System.out.println("String LinkedHashSet: " + stringSet);

        // Filter elements starting with letters after 'B' and display them
        Set<String> filteredStringSet = stringSet.stream()
                .filter(e -> e.compareTo("Banana") > 0)
                //.filter(e -> e.equals("Banana")
                .collect(Collectors.toSet());
        System.out.println("Filtered (after 'B'): " + filteredStringSet);

        // Sort elements (convert to list for sorting) and display them
        List<String> sortedStringList = new ArrayList<>(stringSet);
        Collections.sort(sortedStringList);
        System.out.println("Sorted elements: " + sortedStringList);
    }
}
