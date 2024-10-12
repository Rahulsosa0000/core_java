package com.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<String, Integer> tm = new TreeMap<>();

		// treemap sort Automatically According Key

		tm.put("Grapes", 1);
		tm.put("Apple", 2);
		tm.put("Watermelon", 4);
		tm.put("Banana", 3);
		

		System.out.println("Sort According Key:-" + tm);

		System.out.println(tm.get("Apple"));// key is present in treemap it return

		for (String key : tm.keySet()) {

			System.out.println("key:" + key + " " + "value:" + tm.get(key));
		}
		System.out.println("_____________________________________");
		System.out.println();
		for (Map.Entry<String, Integer> entry : tm.entrySet()) {
			System.out.println("key:-" + " " + entry.getKey() + " " + "value:-" + entry.getValue());
		}

		System.out.println("_____________________________________");
		System.out.println("Sort According Value");

		List<Map.Entry<String, Integer>> list = new ArrayList<>(tm.entrySet());

		list.sort(new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}

		});

		for (Map.Entry<String, Integer> entry : list) {
			System.out.println("key:-" + " " + entry.getKey() + " " + "value:-" + entry.getValue());
		}

		System.out.println("Descendingkeyset"+tm.descendingKeySet());
		System.out.println(tm.descendingMap());

	}

}
