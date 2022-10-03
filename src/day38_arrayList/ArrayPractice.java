package day38_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {


        int[] arr = {3, 5, 7, 111};
        int[] arr2 = {3, 5, 7,20 ,111};

        String[] str = {"hi", "buy", "oki"};

        char [] chara = {'a', 'h', 'b','c','d'};

        Arrays.sort(str);
        Arrays.sort(chara);
        System.out.println("Sorted: " + Arrays.toString(str));
        System.out.println("sorted chars: " + Arrays.toString(chara));

        System.out.println(Arrays.toString(chara).toCharArray());

        System.out.println(Arrays.equals(arr,arr2)); // checks equals
        System.out.println("Copy 3elm: " + Arrays.toString(Arrays.copyOf(arr,5)));//copies & adds
        System.out.println(Arrays.toString(Arrays.copyOf(arr,4)));
        System.out.println(Arrays.toString(Arrays.copyOf(arr,8))); // adds more space


        System.out.println("-------------------------------");
//        String[] str = {"hi", "buy", "oki"};

        String [] newArray = Arrays.copyOf(str, 7);
        System.out.println(Arrays.toString(newArray));
        newArray[3] = "How are you ";
        System.out.println(Arrays.toString(Arrays.copyOf(str,6)));
        System.out.println(Arrays.toString(str));
        newArray[4]= "move it please";
        System.out.println("New Array:"+ Arrays.toString(newArray));
        System.out.println(Arrays.toString(str));

        System.out.println("-------------------------------");

        System.out.println(Arrays.toString(Arrays.copyOf(str,2)));

        System.out.println("-------------------------------");

        String a = "I love java, that's fun";
        String [] fun = a.split(" ");
        String [] fun1 = a.split(" , ");
        String [] fun2 = a.split("java");

        System.out.println("-------------------------------");

        System.out.println(Arrays.toString(fun));
        System.out.println(Arrays.toString(fun1));
        System.out.println(Arrays.toString(fun2));
        System.out.println(Arrays.toString(a.split("that")));
        System.out.println(Arrays.toString(fun1).toCharArray());
        System.out.println(a.toCharArray());

        System.out.println("-------------------------------");

        ArrayList<String> list = new ArrayList<>();
        list.add("move");
        list.add("two");
        list.add("three");
        list.remove(0);
        System.out.println(list);
        System.out.println("-------------------------------");


        String b = "3 4 7 6";
        String [] arry4 = b.split(" ");
        System.out.println(Arrays.toString(arry4));
        String [] arry5 = Arrays.copyOf(arry4,3);
        System.out.println(Arrays.toString(arry5));

        System.out.println("-------------------------------");

        String m = "30";
        Integer x = Integer.parseInt(m);
        System.out.println(x*30);

        System.out.println("-------------------------------");

//        String c = "3 4 7 6";
//        String [] arrC = c.split(  "," , 0);
//
//        for (int i = 0; i < arrC.length ; i++) {
//            System.out.println(Integer.parseInt(arrC[i]));
//        }

        System.out.println("-------------------------------");

        String[] st = {"hi", "buy", "oki"};
        String newSt = String.join(" ",st);
        System.out.println(newSt);
        System.out.println(String.join("777",st));

        System.out.println("-------------------------------");

        int [] arr10 = { 56,23,657,11,2};
        Arrays.sort(arr10); // 2,11
        System.out.println(Arrays.toString(arr10)); // 2,11,23,56,657,
        System.out.println(Arrays.binarySearch(arr10 , 11)); // 1
        System.out.println(Arrays.binarySearch(arr10 , 10)); // -2
        System.out.println(Arrays.binarySearch(arr10 , 700)); // - 6

        System.out.println("-------------------------------");

        String[] st4 = {"hi", "buy", "oki"};
        Arrays.sort(st4);
        System.out.println(Arrays.toString(st4));
        System.out.println(Arrays.binarySearch(st4, "hi"));// 1


    }}
