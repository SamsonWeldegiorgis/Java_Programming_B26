package day58_collection;

import java.util.PriorityQueue;

public class QueueObjects {
    public static void main(String[] args) {


        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(2);
        queue.add(10);
        queue.add(8);
        queue.add(1);
        queue.add(1);
//        queue.get(1);  // No get method,,,it is from List
        System.out.println(queue);  //

        queue.offer(30);
        System.out.println(queue);

//        System.out.println(new PriorityQueue<>().remove()); // causes exception b/s there is no elements
        System.out.println(new PriorityQueue<>().poll()); // causes exception b/s there is no elements
    }
}
