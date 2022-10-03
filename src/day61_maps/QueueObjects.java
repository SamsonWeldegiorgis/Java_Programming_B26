package day61_maps;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueObjects {
    public static void main(String[] args) {

        PriorityQueue <String> queue =new PriorityQueue<>();
        queue.offer("hello");
        queue.offer("world");
        queue.offer("java");
        queue.offer("selenium");
        queue.offer("apple");
        queue.offer("zebra");
        System.out.println(queue); // random prioritize


        System.out.println(queue.peek()); // see the top
        queue.poll(); // remove
        System.out.println(queue);
        System.out.println(queue.poll());

        queue.offer("apple");
        System.out.println(queue);
        System.out.println(" -----------------");

        ArrayDeque <String> arrayDeque = new ArrayDeque();
        arrayDeque.offer("hello");
        arrayDeque.offer("world");
        arrayDeque.offer("java");
        arrayDeque.offer("selenium");
        arrayDeque.offer("apple");
        arrayDeque.offer("zebra");
        System.out.println(arrayDeque); // returns as given/no prioritize

        System.out.println(arrayDeque.poll());  // remove
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.peek()); // top of the elements
        System.out.println(arrayDeque.peekLast()); // last index (element)

        arrayDeque.offerFirst("new word");
        System.out.println(arrayDeque);
        arrayDeque.offerLast("css");
        System.out.println(arrayDeque);
    }
}
