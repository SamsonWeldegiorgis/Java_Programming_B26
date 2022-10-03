package day34_method2;

public class ArmStrong2 {
    public static boolean armstrong ( int num ) {
        int first = num / 100;    // 371 /100 = 3
        int second = (num % 100) / 10;   // 371 % 100 / 10 = 71/10 = 7
        int third = num % 10;     //   371 / 10  = 1

        System.out.println(first); // 1
        System.out.println(second); //
        System.out.println(third); //

        int check = (first * first * first) + (second * second * second) + (third * third * third);

        if (check == num) {
            return true;

        } else

            return false;

    }


    public static void main(String[] args) {
//        int num = 371;
//        int first = num /100;        // 371 /100 = 3
//        int second = ( num % 100 ) /10;   // 371 % 100 / 10 = 71/10 = 7
//        int third  =  num % 10;    //   371 / 10  = 1
//        System.out.println(first);
//        System.out.println(second );
//        System.out.println(third);

        System.out.print(armstrong(153));
        System.out.print(armstrong(370));
        System.out.print(armstrong(371));
        System.out.print(armstrong(407));
        System.out.print(armstrong(888));

    }


}

