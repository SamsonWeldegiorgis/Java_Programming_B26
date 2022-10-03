package day28_arrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class FriendList1 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Put your friends");


        String[] f = new String[3];

        for (int i = 0; i < f.length; i++) {
            System.out.println("Your friends " + (i + 1));
            f[i] = input.nextLine();
        }
        System.out.println("Your friends are: " + Arrays.toString(f));
    }
}
//        for (int i = 0; i < num ; i++) {
//        System.out.println("Put your friends");
//        names[i]= input.next();
//        }
//        System.out.println("Yuor Friends are : " +Arrays.toString( names));
//
//        }}
