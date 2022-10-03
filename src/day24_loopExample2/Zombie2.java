package day24_loopExample2;

import java.util.Arrays;
import java.util.Scanner;

public class Zombie2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Put the 8 digits ");  // 3 6 0 4 3 2 7 0
        int [] inhabitants = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),
                input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int [] nextDay = inhabitants.clone();
        int day = 1;
        System.out.println("Day 0" + Arrays.toString(nextDay) );

        int count =1;
        while (count!=0){
            count=0;

            for (int i = 0; i < inhabitants.length; i++) {

                if((i < inhabitants.length-1 && nextDay[i+1]==0) ||(i> 0 && nextDay[i-1]==0)){
                        inhabitants[i] = inhabitants[i] /2;
                        count+=nextDay[i];
                }
            }   nextDay=inhabitants.clone();
            if(count==1){
                break;
            }
            System.out.println("Day " + day++ +Arrays.toString(nextDay));
        }
        System.out.println("-----Extinct-----");



    }
}
