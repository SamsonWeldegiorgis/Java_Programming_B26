package day61_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterator_RemoveWhileLooping {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,5,6,12,6,35,6,2,5,6,2,3,1,4,5));

        int unique =0;
        // tradintional loop with removing doesn't work, but b/se indexe/elements get shifted
//        for (int i = 0; i <list.size(); i++) {
//            if(list.get(i) <5){
//                list.remove(i);
//            }
//        }

        // removing in a for each loop doesn't work, b/se we can not change the size of the arraylist/cllection whn looping in ror each loop
//        for(int each : list){
//            if(each <5){
//                list.remove(each);
//            }
//        }

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()) { // checks if there is an element next to it, if not stop the loop
            if (it.next() <= 5) { // move to the next element and then return it
                it.remove(); // removing the element from the list
            }
        }
        System.out.println("List : " + list);

        System.out.println(" ----------------------------------------------");

        List<Integer> list2= new ArrayList<>();
        list2.addAll(Arrays.asList(2,5,6,12,6,35,6,2,5,6,2,3,1,4,5));

        list2.removeIf(each -> each <= 5) ;

        System.out.println("List : " + list2);




    }
}
