package day20_string_examples3;

public class MiddleChar2 {
    public static void main(String[] args) {

        String s ="hello";   // to get cd,,,,as a middle numbers
                // 012345

        int mid = s.length()/2;
        int len = s.length();
//
//        char midder = s.charAt()/2;

        System.out.println("MID: " + mid); // 3
        System.out.println("LEN: " + len);  // 6

//        if (s.length()%2 ==0){       // our word is even length   // length /2 > 6 /2 = 3

            char firstMiddle = s.charAt(len/2 );
            char secondMiddle = s.charAt(len/2 -1);
            System.out.println("firtMiddle :"+ firstMiddle); // p
            char thirdMiddle = s.charAt(len/2+1);
            System.out.println("Second Middle :"+secondMiddle); // p
            System.out.println("Third Middle :"+thirdMiddle); // p
            System.out.println("SUBSTR :"+ s.substring(s.length()/2-1)); // p
            System.out.println("SUBSTR1 :"+ s.substring(s.length()/2)); // p

        System.out.println("HELL : " + s.substring(0,s.length()-1));   // hell


            System.out.println("With charAt: "+ firstMiddle+secondMiddle); //pl
            System.out.println("With substring: " +s.substring(mid-1, mid)); // p
            System.out.println("With substring: " +s.substring(mid-1, mid+1)); //pl

            // our word is odd length                       // 7/2 = 3 ..middle character

            char middle = s.charAt(mid);
            System.out.println("With charAt: " + mid); // 3
            System.out.println("With substring: " +s.substring(mid-1, mid+1)); //cd
        }
}
