package day41_arraysPractice5;

import java.util.ArrayList;
import java.util.Arrays;

public class BadPairs {
    /*
      Input: {3, 4, 6, 1, 1, 10, 8, 7};
Output: {3, 4, 1, 10};
Bad pairs that were removed: 6, 1 , .....8, 7
     */
    public static void main(String[] args) {

        ArrayList<Integer> nums  = new ArrayList<>(Arrays.asList(3, 4, 6, 1, 1, 10, 8, 7));
        System.out.println(removeBadPairs(nums));
    }

    public static ArrayList<Integer> removeBadPairs(ArrayList<Integer> list) {

        ArrayList<Integer> goodPairs = new ArrayList<>();

        for (int i = 0; i < list.size(); i += 2) {
            if (list.get(i) < list.get(i + 1)) {
                goodPairs.add(list.get(i));
                goodPairs.add(list.get(i + 1));
            }
        }
        return goodPairs;
    }
}
