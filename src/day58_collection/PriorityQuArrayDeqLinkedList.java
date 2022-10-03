package day58_collection;

import java.awt.*;
import java.util.*;

public interface PriorityQuArrayDeqLinkedList {
    public static void main(String[] args) {


        Queue<Integer> priorityQueue = new PriorityQueue<>();    // no sorting and duplicating ,,
        priorityQueue.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println("PriorityQue : " + priorityQueue);


        Queue<Integer> arrayDequeue = new ArrayDeque<>();  //   same and duplicating
        arrayDequeue.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println("ArrayDeque : " + arrayDequeue);


        Queue<Integer> linkedList = new LinkedList<>();  // same and duplicate
        linkedList.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println("LinkedList: " + linkedList);

        System.out.println(" ------------------------------------");
        priorityQueue.poll();
        arrayDequeue.poll();
        linkedList.poll();
        System.out.println("Hashset : " + priorityQueue); // the 1st index reduced
        System.out.println("LinkedHashSet : " + arrayDequeue); // the 1st index reduced
        System.out.println("LinkedList: " + linkedList); // the 1st index reduced

        System.out.println(" ------------------------------------");
        priorityQueue.poll(); // keep reducing
        arrayDequeue.poll(); // keep reducing
        linkedList.poll(); // keep reducing
        System.out.println("Hashset : " + priorityQueue); // the 1st index reduced
        System.out.println("LinkedHashSet : " + arrayDequeue); // the 1st index reduced
        System.out.println("LinkedList: " + linkedList); // the 1st index reduced

        System.out.println(" --------------------------------");
        System.out.println(((LinkedList) linkedList).get(2));

//        System.out.println(" -------------------------------");
//        System.out.println("PriorityQue");
//        for(Integer each : priorityQueue) {
//            System.out.println(each);

            System.out.println(" -------------------------------");
            System.out.println("Hashset");
            for (Integer each1 : arrayDequeue) {
                System.out.println(each1);

//                System.out.println(" -------------------------------");
//                System.out.println("LinkedList");
//                for (Integer each2 : linkedList) {
//                    System.out.println(each2);
                }

            }


        }
