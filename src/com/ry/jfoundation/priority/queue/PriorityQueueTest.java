package com.ry.jfoundation.priority.queue;

import java.time.LocalDate;
import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        var pq = new PriorityQueue<LocalDate>();
        pq.add(LocalDate.of(1906, 12, 9)); // G. Hopper
        pq.add(LocalDate.of(1815, 12, 10)); // G. Hopper
        pq.add(LocalDate.of(1903, 12, 3)); // G. Hopper
        pq.add(LocalDate.of(1910, 6, 22)); // G. Hopper

        System.out.println("Iterating over elements . . .");
        for (LocalDate date : pq){
            System.out.println(date);
        }
        System.out.println("Removing elements . . .");
        while (!pq.isEmpty()){
            System.out.println(pq.remove());
        }
    }
}
