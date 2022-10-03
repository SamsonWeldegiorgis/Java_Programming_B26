package day58_collection;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayListLinkedListVectorStack {

    public static void main(String[] args) {


        List<Integer > arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(1,2,3,4,5));
//        arrayList.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("Arraylist: " + arrayList);


        List<Integer > linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(1,2,3,4,5));
        linkedList.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("LinkedList: " + linkedList);

        List<Integer > vector = new Vector<>();   // synchronizer,,,,
        vector.addAll(Arrays.asList(1,2,3,4,5));
        vector.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("Vectore: " + vector);

        List<Integer > stack = new Stack<>();   // synchronizer,,,,
        stack.addAll(Arrays.asList(1,2,3,4,5));
//        stack.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("Stack: " + stack);

        System.out.println(" --------------------------------------------");

        System.out.println("ArrayList : ");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));// we can apply for the others also
        }
        System.out.println(" --------------------------------------------");
        for(Integer each : arrayList){
            System.out.println(each);  // we can apply for the others also
        }
        System.out.println(" --------------------------------------------");

        System.out.println("Stack : ");
        System.out.println(stack);
        ((Stack) stack).pop();
        System.out.println(stack); // reduced,,,b/s it popped out,,

    }
}
