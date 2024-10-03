package com.collection;
import java.util.PriorityQueue;

public class PriorityQueuee {

    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("rahul");
        pq.add("keyur");
        pq.add("alpesh");
        pq.add("jignesh");

        System.out.println("Processing Strings in priority order:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());  // Retrieves elements in priority order
        }

        PriorityQueue<Integer> p = new PriorityQueue<>();
        p.add(2);
        p.add(5);
        p.add(6);
        p.add(1);
        p.add(4);
        p.add(3);
        p.add(-1);
        p.add(2);

        System.out.println(p.toString());
    }
}
